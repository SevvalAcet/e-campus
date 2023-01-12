package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Employee;
import com.dersev.ecampus.models.Unit;
import com.dersev.ecampus.repositories.EmployeeDao;
import com.dersev.ecampus.repositories.UnitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;
    @Autowired
    public void EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void delete(int id) {
        employeeDao.deleteById(id);
    }

}
