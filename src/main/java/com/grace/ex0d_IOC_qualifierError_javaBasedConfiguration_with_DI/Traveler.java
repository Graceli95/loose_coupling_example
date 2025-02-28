package com.grace.ex0d_IOC_qualifierError_javaBasedConfiguration_with_DI;

// 1️⃣Traveler class depends on a Vehicle (Loose Coupling)
public class Traveler {
    private Vehicle vehicle;  // 2️⃣Can be Car, Bike, or any future vehicle!

    // 3️⃣Constructor Injection: Spring will provide the vehicle automatically
    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // 4️⃣Traveler starts the journey using the injected vehicle
    public void startJourney() {
        this.vehicle.move();
    }

}
