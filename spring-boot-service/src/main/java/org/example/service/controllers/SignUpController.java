package org.example.service.controllers;

import org.example.service.forms.UserForm;
import org.example.service.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String SignUpPage(UserForm userForm) {
        service.signUp(userForm);
        return "redirect:/login";
    }
}
