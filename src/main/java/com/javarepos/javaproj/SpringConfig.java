package com.javarepos.javaproj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public Development javaDeveloper() {
        return new JavaDevelopment();
    }

    @Bean
    public Development pythonDeveloper() {
        return new PythonDevelopment();
    }
}
