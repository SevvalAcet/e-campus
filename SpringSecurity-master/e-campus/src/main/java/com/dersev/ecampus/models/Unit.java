package com.dersev.ecampus.models;

import com.dersev.ecampus.models.enums.UnitType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "units")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private UnitType unitType;

    @OneToMany(mappedBy = "unit")
    private List<Department> departments;
}
