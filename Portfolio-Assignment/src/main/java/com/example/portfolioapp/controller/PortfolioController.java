package com.example.portfolioapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "home"; // maps to home.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // maps to about.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // maps to contact.html
    }

    @GetMapping("/skills")
    public String skills() {
        return "skills"; // maps to skills.html
    }

    @GetMapping("/education")
    public String education() {
        return "education"; // maps to education.html
    }
}
