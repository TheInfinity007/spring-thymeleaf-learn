package com.github.theinfinity007.spring_mvc_thymeleaf_project.controller;

import com.github.theinfinity007.spring_mvc_thymeleaf_project.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        Student student = new Student();

        model.addAttribute("student", student);

        // add the list of countries to the model
        model.addAttribute("countries", countries);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent.getFirstName() = " + theStudent.getFirstName());
        System.out.println("theStudent.getLastName() = " + theStudent.getLastName());
        
        return "student-confirmation";
    }

}
