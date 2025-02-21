package com.devmaster.lesson02.pkg_annotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyParamController {
    // su dung @requetparam de lay query parameter tu url
    @GetMapping("/my-param")
    public String searchUser(@RequestParam(value = "name",required =false) String name){
        if(name == null){
            return "<h2> No name provided, returning all users";
        }
        return "<h1> Found user with name: " + name;
    }

    // su dung @pathVariable de lay gia tri tu duong dan url
    @GetMapping("/my-variable/{id}")
    public String getUserById(@PathVariable(required = true) String id){
        return "<h1> User with id: " + id;
    }
}
