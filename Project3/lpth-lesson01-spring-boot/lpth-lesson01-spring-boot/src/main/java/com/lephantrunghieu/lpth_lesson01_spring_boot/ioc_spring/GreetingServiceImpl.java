package com.lephantrunghieu.lpth_lesson01_spring_boot.ioc_spring;

import org.springframework.stereotype.Service;
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "<h2>Devmaster[Spring Boot!] Xin chào,</h2> " +
                "<h1 style='color:red; text-align:center'>" +
                name;
    }
}