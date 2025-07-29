package com.github.theinfinity007.spring_mvc_thymeleaf_project.controller;

import com.github.theinfinity007.spring_mvc_thymeleaf_project.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }

//    @PostMapping("/")

}
