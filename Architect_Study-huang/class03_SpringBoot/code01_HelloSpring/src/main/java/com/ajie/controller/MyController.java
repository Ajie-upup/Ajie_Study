package com.ajie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
@RestController
public class MyController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

}
