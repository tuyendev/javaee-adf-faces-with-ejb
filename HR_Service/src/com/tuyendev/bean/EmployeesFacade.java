/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyendev.bean;

import com.tuyendev.base.BaseFacade;
import com.tuyendev.common.Constant;
import com.tuyendev.dto.EmployeesDTO;
import com.tuyendev.local.EmployeesFacadeLocal;
import com.tuyendev.entities.Employees;
import com.tuyendev.mapper.AdvanceMapper;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tuyendev
 */
@Stateless(name = com.tuyendev
                     .common
                     .Constant
                     .EJB_NAME
                     .EMPLOYEES_FACADE,mappedName = com.tuyendev
                                                        .common
                                                        .Constant
                                                        .EJB_MAPPED_NAME
                                                        .EMPLOYEES_FACADE)
public class EmployeesFacade extends BaseFacade<Employees,EmployeesDTO> implements EmployeesFacadeLocal, com.tuyendev.remote.EmployeesFacadeRemote {

    @PersistenceContext(unitName = "HR_Service")
    private EntityManager em;
    
    private final AdvanceMapper mapper = new AdvanceMapper<Employees,EmployeesDTO>(Employees.class, EmployeesDTO.class);

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeesFacade() {
        super(Employees.class,EmployeesDTO.class);
    }

    @Override
    protected AdvanceMapper getMapper() {
        return mapper;
    }

    @Override
    public void create(Employees entity) throws Exception {
        // TODO Implement this method
    }

    @Override
    public void save(EmployeesDTO dto) throws Exception {
        // TODO Implement this method
    }

    @Override
    public String getSequenceName() {
        // TODO Implement this method
        return null;
    }
}
