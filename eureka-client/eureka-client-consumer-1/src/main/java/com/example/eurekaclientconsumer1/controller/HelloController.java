package com.example.eurekaclientconsumer1.controller;

import com.example.eurekaclientconsumer1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class HelloController {


    @Resource
    HelloService helloService;

    @RequestMapping("/consumer-hello-1")
    public String hello() throws Exception {
        String result = helloService.hello();
        System.out.println("result == "+result);
        if (new Random().nextInt(10)>5){
            throw new Exception();
        }
        return result;
    }
}
