package com.example.springcloud.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix //开启Hystrix支持
@EnableCircuitBreaker
@EnableHystrixDashboard    // 开启可视化监控平台
public class Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

}
