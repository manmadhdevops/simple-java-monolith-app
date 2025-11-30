package com.mithuntech.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "! Good luck with your interviews.";
    }
}
