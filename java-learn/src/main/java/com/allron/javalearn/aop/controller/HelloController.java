package com.allron.javalearn.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Allron
 * @date 19/8/29
 */
@RestController
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello(String name){
        return name+" hello";
    }

    @GetMapping("/sayNo")
    public String sayNo(String name){
        return name+" no";
    }
}
