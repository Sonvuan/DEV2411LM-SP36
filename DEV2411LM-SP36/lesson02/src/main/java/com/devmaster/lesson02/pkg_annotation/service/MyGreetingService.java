package com.devmaster.lesson02.pkg_annotation.service;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingService {
    public String greet() {
        return "<h1> Hello form MyGreetingService!";
    }
}
