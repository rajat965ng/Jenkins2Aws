package com.cric.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/v1")
public class DemoController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World...This is me !!";
    }

}
