package com.ek.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class SbController {


    @GetMapping("/say")
    public String sayHello(String name) {
        System.out.println("name: " + name
        );
        return name;
    }

}
