package com.rehan.ch11gettingfriend.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.rehan.ch11gettingfriend")
public class ProjectConfig {

}
