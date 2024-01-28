import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean("miki")
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean 
    Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }
}
