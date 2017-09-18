/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyendev.local;

import com.tuyendev.base.BaseService;

import com.tuyendev.dto.DepartmentsDTO;
import com.tuyendev.entities.Departments;

import javax.ejb.Local;

/**
 *
 * @author tuyendev
 */
@Local
public interface DepartmentsFacadeLocal extends BaseService<Departments,DepartmentsDTO>  {    
}
