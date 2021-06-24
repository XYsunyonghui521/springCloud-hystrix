package com.example.springcloud.client2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {

    @GetMapping("/testFeign1")
    public String testFeign1(String name){
        return "Client2 : testFeign1  我进来了" +  name;
    }

    @GetMapping("/testFeign2")
    public String testFeign2(String name){
        System.out.println("wo jin lai le ");
        throw new RuntimeException("I'm sorry .......");
    }
}
