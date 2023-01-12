package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Student;
import com.dersev.ecampus.repositories.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public StudentServiceImpl(StudentDao studentDao){
        super();
        this.studentDao=studentDao;
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student findById(int id) {
        return studentDao.findById(id).get();
    }

    @Override
    public void delete(int id) {
        studentDao.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
