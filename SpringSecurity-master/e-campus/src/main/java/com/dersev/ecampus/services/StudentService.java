package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Employee;
import com.dersev.ecampus.models.Lesson;
import com.dersev.ecampus.models.Student;
import com.dersev.ecampus.models.Unit;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    Student findById(int id);
    void delete(int id);
    List<Student> findAll();
}

