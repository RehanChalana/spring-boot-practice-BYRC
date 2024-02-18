package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Parrot;
import beans.Person;

@Configuration
public class ProjectConfig {
    
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Mishthi");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Marilyn");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot1")Parrot parrot) {
        Person p = new Person();
        p.setName("Wolf");
        p.setParrot(parrot);
        return p;
    }
    
}
