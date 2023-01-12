package com.dersev.ecampus.services;

import com.dersev.ecampus.models.AcademicEmployee;
import com.dersev.ecampus.models.EmployeeDepartment;
import com.dersev.ecampus.models.Unit;
import com.dersev.ecampus.models.User;

import java.util.List;

public interface AcademicEmployeeService {
    public AcademicEmployee save(AcademicEmployee academicEmployee);
    public AcademicEmployee update(AcademicEmployee academicEmployee);
    AcademicEmployee getById(int id);

    List<AcademicEmployee> getAll();

    void delete(int id);
}
