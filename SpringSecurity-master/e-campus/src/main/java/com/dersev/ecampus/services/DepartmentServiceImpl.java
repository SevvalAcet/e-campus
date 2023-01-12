package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Department;
import com.dersev.ecampus.repositories.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public Department save(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public void delete(int id) {
        departmentDao.deleteById(id);
    }

    @Override
    public List<Department> getAllByUnit(int id) {
        return departmentDao.findAllByUnitId(id);
    }
}
