package com.neosuniversity.democloud.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String getGreeting(){
        return "Hello world cloud foundry neos+ Spring boot";
    }

}
