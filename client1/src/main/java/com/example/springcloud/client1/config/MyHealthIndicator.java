package com.example.springcloud.client1.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return null;
    }

    @Override
    public Health health() {
        return Health.down().withDetail("msg","服务异常").build();
    }
}
