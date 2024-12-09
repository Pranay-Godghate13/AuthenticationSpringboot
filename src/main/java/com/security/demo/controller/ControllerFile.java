package com.security.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ControllerFile {
    @GetMapping("/hello")
    public String printHello()
    {
        return "Hello";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndPoint()
    {
        return "Hello User!!";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndPoint()
    {
        return "Hello Admin!!";
    }
}
