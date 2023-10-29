package com.example.jjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Reference: https://www.geeksforgeeks.org/spring-boot-3-0-jwt-authentication-with-spring-security-using-mysql-database/
POST http://localhost:8080/auth/addNewUser
{
    "name":"user",
    "password":"password",
    "email":"email@email.com",
    "roles":"ROLE_USER"
}

POST http://localhost:8080/auth/generateToken
{
    "username": "user",
    "password": "password"
}
GET http://localhost:8080/auth/user/userProfile
Bearer Token: <token>

 */


@SpringBootApplication
public class JjwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjwtApplication.class, args);
    }

}
