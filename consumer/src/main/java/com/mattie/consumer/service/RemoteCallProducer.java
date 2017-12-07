package com.mattie.consumer.service;

import com.mattie.consumer.hystrix.RemoteCallHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "spring-cloud-producer", fallback = RemoteCallHystrix.class)
public interface RemoteCallProducer {

    @RequestMapping("/hello")
    String sayHello();
}
