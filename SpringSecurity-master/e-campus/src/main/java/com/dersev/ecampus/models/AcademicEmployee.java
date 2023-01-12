package com.dersev.ecampus.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AcademicEmployee {
    @Id
    @Column(name = "academic_personal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "academic_rate")
    private  String degree;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private int numberOfTheses;

    private String phoneNumber;
}
