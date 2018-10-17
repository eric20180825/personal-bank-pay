package com.bankpay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${eureka.instance.hostname}")
    private String hostname;

    @RequestMapping("/index")
    public String index() {
        return "register center is entry!name: "+ hostname;
    }
}
