package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DatabaseConfig {

    @Value("${DB_URL}")
    private String dbUrl;

    @Value("${DB_USER}")
    private String dbUser;

    @Value("${DB_PASSWORD}")
    private String dbPassword;

    @PostConstruct
    public void init() {
        System.out.println("DB_URL: " + dbUrl);
        System.out.println("DB_USER: " + dbUser);
        System.out.println("DB_PASSWORD: " + dbPassword);
    }
}

