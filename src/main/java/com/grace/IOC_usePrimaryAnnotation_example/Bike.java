package com.grace.IOC_usePrimaryAnnotation_example;

import org.springframework.stereotype.Component;

// 1️⃣Bike class implements Vehicle but is NOT marked as Primary
@Component
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving ..");
    }
}
