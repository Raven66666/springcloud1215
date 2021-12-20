package com.example.usersbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersBackupApplication.class, args);
    }

}
