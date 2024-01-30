package com.rehan;


import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(
                "Person's name: " + person.getName());
        System.out.println(
                "Parrot's name: " + parrot.getName());
        System.out.println(
                "Person's parrot: " + person.getParrot());
    }
}

