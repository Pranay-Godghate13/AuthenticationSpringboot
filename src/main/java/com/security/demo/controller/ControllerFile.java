package com.security.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ControllerFile {
    @GetMapping("/hello")
    public String printHello()
    {
        return "Hello";
    }
}
