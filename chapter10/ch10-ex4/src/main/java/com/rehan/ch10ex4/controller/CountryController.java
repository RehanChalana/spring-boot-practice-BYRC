package com.rehan.ch10ex4.controller;

import com.rehan.ch10ex4.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/india")
    public ResponseEntity<Country> india() {
        Country c = Country.of("india",150);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Asia")
                .header("capital","India")
                .header("favourite_food","golgappa")
                .body(c);
    }
}
