package com.practice.parcialdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saludo")
public class HelloController {

    @GetMapping("/Hola")
    public String hola() {
        return "Hola Silva";
    }
}
