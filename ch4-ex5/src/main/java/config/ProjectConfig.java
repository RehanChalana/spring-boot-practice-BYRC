package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages ={"proxies","services","repositories"})
@Configuration
public class ProjectConfig {
}
