package com.burnout.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "hello world";
    }

    @PostMapping
    public String other() {
        return "ini return yang akan didapatkan bila anda hit dengan method post";
    }
}