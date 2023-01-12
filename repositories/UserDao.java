package com.dersev.ecampus.repositories;

import com.dersev.ecampus.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmail(String username);

}
