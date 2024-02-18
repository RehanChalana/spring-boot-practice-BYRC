package main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Mishthi";
    public Parrot() {
        System.out.println("Parrot created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "parrot: "+this.name;
    }
}
