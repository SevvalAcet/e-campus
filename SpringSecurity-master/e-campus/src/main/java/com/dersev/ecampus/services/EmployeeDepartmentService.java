package com.dersev.ecampus.services;

import com.dersev.ecampus.models.EmployeeDepartment;

import java.util.List;

public interface EmployeeDepartmentService {
    EmployeeDepartment add(EmployeeDepartment employeeDepartment);

    EmployeeDepartment update(EmployeeDepartment employeeDepartment);

    void delete(int id);

    EmployeeDepartment getById(int id);

    List<EmployeeDepartment> getAll();


}
