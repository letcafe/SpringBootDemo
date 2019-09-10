package com.letcafe.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private static int val = 0;

    @RequestMapping(path = "hello")
    public String res() {
        return "hello world3";
    }

    @RequestMapping(path = "hello2")
    public String res2() {
        return "hello world" + ++val;
    }
}
