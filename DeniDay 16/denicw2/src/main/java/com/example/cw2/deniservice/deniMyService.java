package com.example.cw2.deniservice;

import org.springframework.stereotype.Service;

@Service
public class deniMyService {

    public String process(String input) {
        System.out.println("Processing: " + input);
        return "Processed: " + input;
    }
}
