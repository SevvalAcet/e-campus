package com.dersev.ecampus.api.controller;
import com.dersev.ecampus.models.AcademicEmployee;
import com.dersev.ecampus.services.AcademicEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/academic_employees")
public class AcademicEmployeesController {
    public final AcademicEmployeeService academicEmployeeService;


    public AcademicEmployeesController(AcademicEmployeeService academicEmployeeService) {
        this.academicEmployeeService = academicEmployeeService;
    }
    @PostMapping
    public ResponseEntity<AcademicEmployee> add(@RequestBody AcademicEmployee academicPersonal) {
        return  ResponseEntity.ok(academicEmployeeService.save(academicPersonal));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AcademicEmployee> update(@PathVariable int id, @RequestBody AcademicEmployee academicEmployee){
        return new ResponseEntity<>(academicEmployeeService.update(academicEmployee), HttpStatus.OK);
    }


}
