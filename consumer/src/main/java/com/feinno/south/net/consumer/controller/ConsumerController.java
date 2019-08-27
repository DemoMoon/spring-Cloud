package com.feinno.south.net.consumer.controller;

import com.feinno.south.net.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return consumerService.test(name);
    }
}