package com.dersev.ecampus.services;

import com.dersev.ecampus.models.AcademicEmployee;
import com.dersev.ecampus.repositories.AcademicEmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicEmployeeServiceImpl implements AcademicEmployeeService  {

    private final AcademicEmployeeDao academicEmployeeDao;

    public AcademicEmployeeServiceImpl(AcademicEmployeeDao academicEmployeeDao) {
        this.academicEmployeeDao = academicEmployeeDao;
    }

    @Override
    public AcademicEmployee save(AcademicEmployee academicEmployee) {
        return academicEmployeeDao.save(academicEmployee);
    }

    @Override
    public AcademicEmployee update(AcademicEmployee academicEmployee) {
        return academicEmployeeDao.save(academicEmployee);
    }

    @Override
    public AcademicEmployee getById(int id) {
        return academicEmployeeDao.findById(id).get();
    }

    @Override
    public List<AcademicEmployee> getAll() {
        return academicEmployeeDao.findAll();
    }

    @Override
    public void delete(int id) {
        academicEmployeeDao.deleteById(id);
    }
}
