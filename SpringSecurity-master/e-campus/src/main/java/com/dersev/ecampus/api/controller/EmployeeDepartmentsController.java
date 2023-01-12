package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Department;
import com.dersev.ecampus.models.EmployeeDepartment;
import com.dersev.ecampus.services.EmployeeDepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employeeDepartments")
public class EmployeeDepartmentsController {

    private final EmployeeDepartmentService employeeDepartmentService;

    public EmployeeDepartmentsController(EmployeeDepartmentService employeeDepartmentService) {
        this.employeeDepartmentService = employeeDepartmentService;
    }


    @PostMapping
    public ResponseEntity add(@RequestBody EmployeeDepartment employeeDepartment ) {
        return ResponseEntity.ok("Sucessful!");
    }

    @GetMapping("{unitId}")
    public ResponseEntity getAll() {
        return ResponseEntity.ok("Successful!");
    }
}
