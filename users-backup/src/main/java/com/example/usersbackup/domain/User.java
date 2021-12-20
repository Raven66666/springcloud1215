package com.example.usersbackup.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer uId;
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
