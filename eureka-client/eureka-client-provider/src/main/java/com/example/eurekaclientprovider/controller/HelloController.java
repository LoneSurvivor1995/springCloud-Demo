package com.example.eurekaclientprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
//        System.out.println("name == "+name);
        return "[provider] hello "+"name"+"，this is first messge";
    }
}
