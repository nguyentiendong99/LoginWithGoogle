package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld(){
        return "helloWord";
    }
    @GetMapping("/restricted")
    public String restricted(){
        return "nguyen tien dong yeu hoang thi bich hong";
    }
}
