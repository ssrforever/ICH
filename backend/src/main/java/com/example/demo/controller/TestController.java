package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "来自 SpringBoot 后端的非遗平台数据连接成功！";
    }
}