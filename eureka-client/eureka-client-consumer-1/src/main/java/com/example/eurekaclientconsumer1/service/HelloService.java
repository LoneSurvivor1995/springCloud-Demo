package com.example.eurekaclientconsumer1.service;

import com.example.eurekaclientconsumer1.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-producer",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

}
