package com.example.springcloud.client1.controller;

import com.example.springcloud.client1.feign.Client2Feign;
import com.example.springcloud.client1.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestFeignController {
    @Autowired
    private TestFeignService testFeignService;
    @Resource
    private Client2Feign client2Feign;

    @GetMapping("/testFeign1")
    public String testFeign1(String name){
        return client2Feign.testFeign1(name);
    }
    @GetMapping("/testFeign2")
    public String testFeign2(String name){
        return client2Feign.testFeign2(name);
    }


}
