package com.training.cicdproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {

    @GetMapping("hello")
    public String getHelloWorld(){
        return "Hello world !!";
    }
}
