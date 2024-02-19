package com.rehan.ch9ex2.controllers;

import com.rehan.ch9ex2.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/home")
    public String home(@RequestParam(required = false) String logout, Model page) {
        if(logout != null) {
            loggedUserManagementService.setUsername(null);
        }
        String username = loggedUserManagementService.getUsername();
        if(username == null) {
            return "redirect:/";
        }
        page.addAttribute("username",username);
        return "home.html";
    }
}
