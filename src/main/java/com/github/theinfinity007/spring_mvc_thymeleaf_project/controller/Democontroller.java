package com.github.theinfinity007.spring_mvc_thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Democontroller {

    @GetMapping("/hello")
    public String getHello(Model model){

        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld";
    }

}
