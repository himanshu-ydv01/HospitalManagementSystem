package com.example.hospital_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class, args);
    }

    @GetMapping
    public String HelloWorld() {
        return "Hello World!";
    }
}
