package com.rehan;

public class Person {
    private String name;
    private Parrot parrot;

    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
