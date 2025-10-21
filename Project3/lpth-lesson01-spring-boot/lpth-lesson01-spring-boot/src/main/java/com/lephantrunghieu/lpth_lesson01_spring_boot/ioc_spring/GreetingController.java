package com.lephantrunghieu.lpth_lesson01_spring_boot.ioc_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private final GreetingService greetingService;
    // Sử dụng Constructor-based Dependency Injection
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greet")
    public String greet() {
        return greetingService.greet("Lê Hiếu");
    }
}