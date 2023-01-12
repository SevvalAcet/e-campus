package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Lesson;
import com.dersev.ecampus.models.Student;
import com.dersev.ecampus.repositories.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    private final StudentDao studentService;

    @Autowired
    public StudentsController(StudentDao studentService) {

        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Student student)  {

        return ResponseEntity.ok(studentService.save(student));
    }

    @GetMapping("/getall")
    public List<Student> getAll(){
         return this.studentService.findAll();
    }
}
