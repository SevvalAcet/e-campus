package com.dersev.ecampus.services;


import com.dersev.ecampus.models.Employee;
import com.dersev.ecampus.models.Unit;
import com.dersev.ecampus.repositories.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee findById(int id);
    void delete(int id);
    List<Employee> findAll();
}
