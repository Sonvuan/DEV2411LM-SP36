package com.devmaster.lesson02.pkg_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String appName(){
        return "<h1> Vien cong nghe DevMaster</h1> <h2> Spring boot application";
    }
}
