package com.rehan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/adduser")
    public void addUser(@RequestHeader String username, @RequestHeader String password) {
        String encodedPassword = passwordEncoder.encode(password);
        userRepository.addUser(username,encodedPassword);
    }
}
