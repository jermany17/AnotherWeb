package com.example.AnotherWeb.service;

import com.example.AnotherWeb.db.UserEntity;
import com.example.AnotherWeb.db.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> readAll(){
        return userRepository.findAll();
    }
}
