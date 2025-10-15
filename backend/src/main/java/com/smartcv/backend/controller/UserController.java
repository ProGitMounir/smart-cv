package com.smartcv.backend.controller;
import org.springframework.web.bind.annotation.*;

import com.smartcv.backend.models.Users;
import com.smartcv.backend.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return repo.findAll();
    }
}
