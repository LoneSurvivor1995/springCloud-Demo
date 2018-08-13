package com.example.eurekaclientconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer-hello")
    public String hello(){
        String result = restTemplate.getForEntity("http://spring-cloud-producer/hello",String.class).getBody();
        System.out.println("result == "+result);
        return result;
    }
}
