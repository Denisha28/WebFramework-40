package com.example.cw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cw2.deniservice.deniMyService;

@SpringBootApplication
public class Denicw1Application implements CommandLineRunner {

    @Autowired
    private deniMyService myService;

    public static void main(String[] args) {
        SpringApplication.run(Denicw1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Final Result: " + myService.process("Hello, Spring AOP!"));
    }
}
