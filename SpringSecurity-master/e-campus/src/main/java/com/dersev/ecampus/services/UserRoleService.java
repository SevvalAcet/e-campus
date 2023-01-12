package com.dersev.ecampus.services;

import com.dersev.ecampus.models.UserRole;
import com.dersev.ecampus.repositories.UserRoleDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserRoleService {

    private final UserRoleDao userRoleDao;

    public UserRole saveRole(UserRole role)
    {
        userRoleDao.save(role);
        return  role;
    }

    public List<UserRole> getAll()
    {
        return userRoleDao.findAll();
    }
}


