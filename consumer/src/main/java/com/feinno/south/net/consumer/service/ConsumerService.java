package com.feinno.south.net.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * value 值需要与服务提供者的 spring.application.name相同
 * @author chen ming hui
 * @date 2019/8/27 9:38
 * @version V1.0
 * @modificationHistory   Who           When                 What
 * ------------------   ------     ------------      ------------------
*/
@FeignClient(value = "usercenter-client")
public interface  ConsumerService {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test(@RequestParam("name") String name);
}
