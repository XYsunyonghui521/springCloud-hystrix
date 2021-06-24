package com.example.springcloud.client1.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="CLIENT2",fallback = Client2FeignFallback.class)
public interface Client2Feign {

    @GetMapping("/testFeign1")
    public String testFeign1(@RequestParam(value="name") String name);
    @GetMapping("/testFeign2")
    public String testFeign2(@RequestParam(value="name") String name);
}
