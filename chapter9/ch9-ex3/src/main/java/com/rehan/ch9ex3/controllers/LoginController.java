package com.rehan.ch9ex3.controllers;

import com.rehan.ch9ex3.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping
    public String loginPost(@RequestParam String username, @RequestParam String password, Model page) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();
        if(loggedIn) {
            page.addAttribute("message","Login Succesfull");
            return "redirect:/home";
        } else {
            page.addAttribute("message","Login failed");
            return "login.html";
        }

    }
}
