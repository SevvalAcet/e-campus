package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Department;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);

    void delete(int id);

    List<Department> getAllByUnit(int id);
}
