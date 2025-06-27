package com.example.UserService.controller;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    /**
     * This constructor is used to autowire {@link UserService} into the {@link UserController}.
     * @param userService UserService object
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * This function is used to get all users from database.
     * It uses {@link UserService#getAllUsers()} function to get all users.
     * @return List of users
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * This function is used to get user with specific id from database.
     * It uses {@link UserService#getUserById(int)} function to get user by id.
     * @param id id of user
     * @return User object
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }



}
