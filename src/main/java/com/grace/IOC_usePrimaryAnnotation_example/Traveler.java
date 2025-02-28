package com.grace.IOC_usePrimaryAnnotation_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 1️⃣Traveler depends on a Vehicle, but doesn't specify which one
@Component
public class Traveler {
    private Vehicle vehicle;

    // 2️⃣Spring will inject the default (Primary) vehicle
//    @Autowired
    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // 3️⃣Traveler starts the journey using the injected vehicle
    public void startJourney() {
        this.vehicle.move();
    }
}
