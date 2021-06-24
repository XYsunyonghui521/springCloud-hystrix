package com.example.springcloud.client1.service;

import org.springframework.stereotype.Service;

@Service
public class TestFeignService {

    public String testFeign1(String name){
        return "testFeign1 进来了" + name;
    }

}
