package com.example.cw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.cw1.deniservice.deniMyService;

@SpringBootApplication
public class Cw1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Cw1Application.class, args);
        deniMyService myService = context.getBean(deniMyService.class);
        myService.doSomething();
    }
}
