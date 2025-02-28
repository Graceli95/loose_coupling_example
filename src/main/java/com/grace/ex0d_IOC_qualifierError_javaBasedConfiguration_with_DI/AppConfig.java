package com.grace.ex0d_IOC_qualifierError_javaBasedConfiguration_with_DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 1️⃣Marks this class as a Spring configuration class
@Configuration
public class AppConfig {

    // 2️⃣Creates a Spring bean for Car,  Creates a Car bean with the name "carBean"
    @Bean(name = "carBean")
    public Vehicle car() {
        return new Car();  // Spring will create and manage this object
    }

    // 3️⃣Creates a Spring bean for Bike
    @Bean(name = "bikeBean")    //Creates a Bike bean with the name "bikeBean"
    public Vehicle bike(){
        return new Bike(); // Spring will create and manage this object
    }

    // 4️⃣Creates a Spring bean for Traveler and injects a Vehicle(Dependency Injection)  // 4️⃣Creates a Traveler bean and specifies which vehicle to inject
    @Bean
    public Traveler traveler(@Qualifier("carBean") Vehicle vehicle){
        return new Traveler(vehicle); // Injecting Vehicle   // Injects Car as the default
    }
}
