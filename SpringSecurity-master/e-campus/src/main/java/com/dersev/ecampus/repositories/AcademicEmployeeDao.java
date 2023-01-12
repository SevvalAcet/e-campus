package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.AcademicEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicEmployeeDao extends JpaRepository<AcademicEmployee,Integer> {
}

