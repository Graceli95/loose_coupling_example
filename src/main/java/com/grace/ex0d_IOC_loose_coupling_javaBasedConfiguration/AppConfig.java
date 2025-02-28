package com.grace.ex0d_IOC_loose_coupling_javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 1️⃣Marks this class as a Spring configuration class
@Configuration
public class AppConfig {

    // 2️⃣Creates a Spring bean for Car
    @Bean
    public Vehicle car() {
        return new Car();  // Spring will create and manage this object
    }

    // 3️⃣Creates a Spring bean for Bike
    @Bean
    public Vehicle bike(){
        return new Bike(); // Spring will create and manage this object
    }
}
