package com.example.novelserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {
    @RequestMapping("/")
    public String index(){
        return "This is main page of novel website";
    }
}
