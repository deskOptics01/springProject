package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello mate, this is Springboot Demo!";
    }

    @RequestMapping("/hi")
    String hi() {
        return "Hi mate, this is Springboot Demo!";
    }
}
