package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Unit;
import com.dersev.ecampus.services.UnitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("units")
public class UnitsController {
    private UnitService unitService;
    public UnitsController(UnitService unitService) {
        this.unitService = unitService;
    }
    @PostMapping
    public ResponseEntity add(@RequestBody Unit unit) {
       Unit savedUnit =  unitService.save(unit);
       return ResponseEntity.ok(savedUnit);
    }
    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(unitService.findAll());
    }
    @DeleteMapping
    public ResponseEntity delete(@RequestBody Unit unit) {
        Unit savedUnit =  unitService.save(unit);
        return ResponseEntity.ok(savedUnit);
    }
}
