package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.User;
import com.dersev.ecampus.services.UserRoleService;
import com.dersev.ecampus.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;
    private final UserRoleService userRoleService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/users").toUriString());
        User new_user = userService.saveUser(user);
        System.out.println(new_user);
        return ResponseEntity.created(uri).body(new_user);
    }

    @PostMapping("/users/roles")
    public ResponseEntity<?> addRoleToUser(@RequestBody UserRoleForm form)
    {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok("Successful!");
    }
}

   @Data
   class UserRoleForm
   {
      private String username;
      private String roleName;
   }
