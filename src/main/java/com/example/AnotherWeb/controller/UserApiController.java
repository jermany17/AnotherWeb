package com.example.AnotherWeb.controller;

import com.example.AnotherWeb.db.UserEntity;
import com.example.AnotherWeb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    // read
    @GetMapping("/all")
    public List<UserEntity> readAll(){
        return userService.readAll();
    }
}
