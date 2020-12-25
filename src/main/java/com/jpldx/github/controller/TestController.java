package com.jpldx.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen.xudong
 * @version 1.0
 * @since 2020/12/25
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello")
    public String hello(){
        return "hello github actions~~!";
    }

}
