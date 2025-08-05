package com.github.theinfinity007.spring_mvc_thymeleaf_project.controller;

import com.github.theinfinity007.spring_mvc_thymeleaf_project.model.Customer;
import com.github.theinfinity007.spring_mvc_thymeleaf_project.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/showCustomerForm")
    public String showForm(Model model) {

        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "customer-form";
    }

    @PostMapping("/processCustomerForm")
    public String processCustomerForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult
    ) {

        // If the form validation has error, return user to the form page
        if (theBindingResult.hasErrors()) {
            return "customer-form";
        }

        return "customer-confirmation";
    }

}
