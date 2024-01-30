package config;

import com.rehan.Parrot;
import com.rehan.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Marilyn");
        p.setParrot(parrot());
        return  p;
    }

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Mishthi");
        return p;
    }


}
