package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
