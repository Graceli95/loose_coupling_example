package com.grace.IOC_usePrimaryAnnotation_example;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// 1️⃣Car class implements Vehicle and is marked as Primary
@Component
@Primary   // 2️⃣Spring will inject Car if no @Qualifier is used
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving ..");
    }
}

//The @Primary annotation tells Spring which bean to use by default when multiple beans of the same type exist.
//It works globally unless another specific bean is explicitly requested using @Qualifier.

//🎯 What Did We Fix?
//✅ Before: Spring didn’t know whether to use Car or Bike, causing a "No Qualifying Bean" error.
//✅ After: We used @Primary in Car.java, so Spring picks Car by default without needing @Qualifier.
//🛠 Bonus: Switch to Bike Without Changing Traveler Code!
//If you want Traveler to use Bike instead of Car, simply:
//🔹 Remove @Primary from Car.java
//🔹 Add @Primary to Bike.java
//Now Traveler will use a Bike instead of a Car! �