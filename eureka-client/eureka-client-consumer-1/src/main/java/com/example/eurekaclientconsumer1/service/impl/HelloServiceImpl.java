package com.example.eurekaclientconsumer1.service.impl;

import com.example.eurekaclientconsumer1.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "[consumer-1]this is fall back implement ...";
    }
}
