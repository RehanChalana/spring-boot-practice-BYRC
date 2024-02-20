package com.rehan.ch10ex3.controller;

import com.rehan.ch10ex3.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/india")
    public Country india() {
        Country c = Country.of("india",150);
        return c;
    }

    @GetMapping("/all")
    public List<Country> countryList() {
        Country c1 = Country.of("india",135);
        Country c2 = Country.of("france",69);
        return List.of(c1,c2);
    }
}
