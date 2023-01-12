package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDepartmentDao extends JpaRepository<EmployeeDepartment, Integer> {
}
