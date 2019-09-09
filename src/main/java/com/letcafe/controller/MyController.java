package com.letcafe.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @RequestMapping(path = "hello")
    public String res() {
        return "hello world2";
    }
}
