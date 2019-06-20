package com.wangsu.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linhz
 * @version 1.0 2019/6/4
 * @since 1.0
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping(value = "/hello")
    public String say() {
        return name;
    }
}
