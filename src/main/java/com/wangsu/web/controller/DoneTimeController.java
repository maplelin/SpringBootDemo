package com.wangsu.web.controller;

import com.wangsu.web.annotation.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linhz
 * @version 1.0 2019/6/19
 * @since 1.0
 */
@RestController
public class DoneTimeController {

    @GetMapping("/index")
    @DoneTime(param = "IndexController")
    public String index() {
        System.out.println("方法执行");
        return "hello dalaoyang";
    }

    @GetMapping("/index2")
    public String index2() {
        System.out.println("方法2执行");
        return "hello dalaoyang";
    }
}
