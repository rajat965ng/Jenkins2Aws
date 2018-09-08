package com.hello.ctx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/v1/demo")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Demo ..... I'm here !!";
    }

}
