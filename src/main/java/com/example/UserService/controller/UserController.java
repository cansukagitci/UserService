package com.example.UserService.controller;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    // Constructor ile servis inject ediliyor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Tüm kullanıcıları listele
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }



}
