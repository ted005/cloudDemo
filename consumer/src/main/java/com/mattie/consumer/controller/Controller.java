package com.mattie.consumer.controller;

import com.mattie.consumer.service.RemoteCallProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RemoteCallProducer remoteCallProducer;

    @RequestMapping("/helloConsumer")
    public String hello() {
        return remoteCallProducer.sayHello();
    }
}
