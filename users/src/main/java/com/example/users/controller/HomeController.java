package com.example.users.controller;

import com.example.users.domain.User;
import com.example.users.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/users")
    public List<User> home(Model model){
        System.out.println("user1" + LocalDateTime.now());
       return userMapper.findAll();

    }
}
