package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Employee;
import com.dersev.ecampus.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/employee")
@RestController
public class EmployeesController {
    private final EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

}
