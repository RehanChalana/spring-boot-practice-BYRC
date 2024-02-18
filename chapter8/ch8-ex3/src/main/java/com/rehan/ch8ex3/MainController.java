package com.rehan.ch8ex3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @GetMapping("/home")
    public String home(@RequestParam(required = false) String username , @RequestParam(required = false) String color , Model page) {
        page.addAttribute("color", color);
        page.addAttribute("username", username);
        return "home.html";
    }
}
