package com.example.UserService.service;

import com.example.UserService.entity.User;
import com.example.UserService.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    /**
     * Constructor for UserService class
     * @param userRepository repository for User entity
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * Retrieve all users from database
     * @return list of all users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Retrieve user by id from database
     * @param id_user id of the user
     * @return user with id
     */
    public User getUserById(long id_user) {
        return userRepository.findById(id_user).orElse(null);
    }

}
