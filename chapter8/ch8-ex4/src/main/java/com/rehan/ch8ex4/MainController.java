package com.rehan.ch8ex4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,Model page) {
        page.addAttribute("username", "RC");
        page.addAttribute("color", color);
        return "home.html";
    }
}
