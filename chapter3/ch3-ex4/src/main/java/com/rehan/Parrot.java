package com.rehan;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Mishthi";
    // Omitted getters and setters
    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    public String getName() {
        return name;
    }

}
