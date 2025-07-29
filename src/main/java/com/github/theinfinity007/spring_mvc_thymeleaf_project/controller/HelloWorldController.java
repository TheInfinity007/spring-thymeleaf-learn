package com.github.theinfinity007.spring_mvc_thymeleaf_project.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld-process-form";
    }

    // Controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read paramerter from form
        String name = request.getParameter("studentName");

        // convert to all caps
        name = name.toUpperCase();

        // create the message
        String result = "Yo! " + name;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld-process-form";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String sName, Model model){


        // convert to all caps
        sName = sName.toUpperCase();

        // create the message
        String result = "Hey My Friend from v3! " + sName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld-process-form";
    }
}
