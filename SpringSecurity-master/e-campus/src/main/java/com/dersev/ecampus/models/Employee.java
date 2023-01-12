package com.dersev.ecampus.models;

import com.dersev.ecampus.models.enums.UnitType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long wage;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private UnitType unitType;
}
