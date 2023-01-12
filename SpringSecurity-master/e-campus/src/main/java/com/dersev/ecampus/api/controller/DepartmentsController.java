package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Department;
import com.dersev.ecampus.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
public class DepartmentsController {
    private DepartmentService departmentService;

    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.save(department));
    }
    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable int id) {
        departmentService.delete(id);
        return ResponseEntity.ok("Success!");
    }

    @GetMapping("{unitId}")
    public ResponseEntity getAllByUnit(@PathVariable int unitId) {
        return ResponseEntity.ok(departmentService.getAllByUnit(unitId));
    }
}
