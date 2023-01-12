package com.dersev.ecampus.services;

import com.dersev.ecampus.models.EmployeeDepartment;
import com.dersev.ecampus.repositories.EmployeeDao;
import com.dersev.ecampus.repositories.EmployeeDepartmentDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDepartmentServiceImpl implements EmployeeDepartmentService {

    private final EmployeeDepartmentDao employeeDepartmentDao;

    public EmployeeDepartmentServiceImpl(EmployeeDepartmentDao employeeDepartmentDao) {
        this.employeeDepartmentDao = employeeDepartmentDao;
    }

    @Override
    public EmployeeDepartment add(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentDao.save(employeeDepartment);
    }

    @Override
    public EmployeeDepartment update(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentDao.save(employeeDepartment);
    }

    @Override
    public void delete(int id) {
        employeeDepartmentDao.deleteById(id);
    }

    @Override
    public EmployeeDepartment getById(int id) {
        return employeeDepartmentDao.findById(id).get();
    }

    @Override
    public List<EmployeeDepartment> getAll() {
        return employeeDepartmentDao.findAll();
    }
}
