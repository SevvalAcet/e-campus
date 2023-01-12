package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}
