package com.mattie.consumer.hystrix;

import com.mattie.consumer.service.RemoteCallProducer;
import org.springframework.stereotype.Component;

@Component
public class RemoteCallHystrix implements RemoteCallProducer {
    @Override
    public String sayHello() {
        return "sorry";
    }
}
