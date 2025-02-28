package com.grace.AnnotationBasedConfiguration_IOC_Example;


//Create a configuration class that enables component scanning

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.grace.AnnotationBasedConfiguration_IOC_Example")
public class AppConfig {
    // No explicit bean definitions; @ComponentScan discovers beans automatically
}
