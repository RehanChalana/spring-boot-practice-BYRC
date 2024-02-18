package com.rehan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Marilyn";
    @Autowired
    private Parrot parrot;

    public String getName() {
        return name;
    }


    public Parrot getParrot() {
        return parrot;
    }



}
