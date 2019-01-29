package com.sike.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sike.dubbo.service.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {

    @Reference
    ProviderService providerService;

    @RequestMapping("/hello")
    public String hello() {
        return providerService.sayHello();
    }
}
