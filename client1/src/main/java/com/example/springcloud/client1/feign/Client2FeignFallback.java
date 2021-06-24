package com.example.springcloud.client1.feign;

import org.springframework.stereotype.Component;

@Component
public class Client2FeignFallback implements Client2Feign {
    @Override
    public String testFeign1(String name) {
        return "Default value " + name;
    }

    @Override
    public String testFeign2(String name) {
        return "降级处理的方法。。。。。。";
    }
}
