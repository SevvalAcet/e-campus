package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentDao extends JpaRepository<Department,Integer> {
    List<Department> findAllByUnitId(@Param("unitId") int unitId);
}
