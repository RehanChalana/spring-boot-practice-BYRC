package com.rehan.ch8ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/home")
    public String home(@RequestParam String color, Model page) {
        page.addAttribute("username","RC");
        page.addAttribute("color", color);
        return "home.html";
    }
    
}
