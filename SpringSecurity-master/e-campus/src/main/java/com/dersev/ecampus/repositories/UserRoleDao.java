package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<UserRole, Integer> {
    UserRole findByName(String name);

}
