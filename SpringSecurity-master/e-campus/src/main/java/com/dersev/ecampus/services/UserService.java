package com.dersev.ecampus.services;

import com.dersev.ecampus.models.User;
import com.dersev.ecampus.models.UserRole;

import com.dersev.ecampus.repositories.UserDao;
import com.dersev.ecampus.repositories.UserRoleDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements UserDetailsService {

    private final UserDao userDao;
    private final UserRoleDao userRoleDao;
    private  BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public List<User> getAllUsers()
    {
        log.info("Get All Users...");
        return userDao.findAll();
    }
    public User saveUser(User user)
    {
        log.info("Saving user...");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userDao.save(user);
        return user;
    }
    public User getUser(String username)
    {
        return userDao.findByEmail(username);
    }
    public UserRole saveRole(UserRole role) {
        log.info("Saving role...");
        userRoleDao.save(role);
        return role;
    }

    public void  addRoleToUser(String username, String roleName) {
        log.info("Adding {} role to user {}...", roleName,username);
        User user = getUser(username);
        UserRole role = userRoleDao.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByEmail(username);
        if(user == null)
            throw new UsernameNotFoundException("Username not found!");
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(userRole -> authorities.add(new SimpleGrantedAuthority(userRole.getName())));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }

    public User getUserById(Long id) {
        Optional<User> user = userDao.findById(Integer.getInteger(id.toString()));
        if(user == null)
            throw new UsernameNotFoundException("Username not found!");
        return user.get();
    }
}