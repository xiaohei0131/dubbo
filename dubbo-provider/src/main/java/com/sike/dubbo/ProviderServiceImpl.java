package com.sike.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.sike.dubbo.service.ProviderService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ProviderService.class)
@Component
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "你好！";
    }
}
