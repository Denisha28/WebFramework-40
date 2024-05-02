package com.example.cw1.deniservice;

import org.springframework.stereotype.Service;

@Service
public class deniMyService {

    public void doSomething() {
        System.out.println("Around advice: Executing after doSomething()");
    }
}
