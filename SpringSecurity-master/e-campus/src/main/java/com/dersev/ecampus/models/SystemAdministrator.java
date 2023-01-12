package com.dersev.ecampus.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "system_administrators")
public class SystemAdministrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

