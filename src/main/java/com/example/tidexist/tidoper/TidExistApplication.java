package com.example.tidexist.tidoper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication (scanBasePackages = {
        "com.example.tidexist.tidoper.config",
        "com.example.tidexist.tidoper.controller",
        "com.example.tidexist.tidoper.entity",
        "com.example.tidexist.tidoper.repository",
        "com.example.tidexist.tidoper.service",
        "com.example.tidexist.tidoper.serviceimpl"})
public class TidExistApplication {

    public static void main(String[] args) {
        SpringApplication.run(TidExistApplication.class, args);
    }

}
