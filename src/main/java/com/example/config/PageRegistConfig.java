package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PageRegistConfig implements WebMvcConfigurer {
    public void addViewControlloers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("Home");
        registry.addViewController("/").setViewName("Home");
        registry.addViewController("/login").setViewName("Login");
        registry.addViewController("/hello").setViewName("Hello");
    }
}
