package com.dersev.ecampus.models;


//@Entity
//@Data
//@Table(name="students")

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String schoolNumber;
    public float averageSuccess;
    public String degreeType;
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
}
