package com.grace.IOC_usePrimaryAnnotation_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration  //1️⃣Marks this class as a Spring configuration class
@ComponentScan(basePackages = "com.grace.IOC_usePrimaryAnnotation_example") // 2️⃣Automatically scans for @Component classes
public class AppConfig {
}

//📌 Since @ComponentScan is used, Spring will find Car, Bike, and Traveler automatically!