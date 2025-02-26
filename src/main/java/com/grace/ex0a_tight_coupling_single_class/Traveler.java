package com.grace.ex0a_tight_coupling_single_class;

public class Traveler {
    private Car car; // 2️⃣Traveler can only use a Car
    // 3️⃣Traveler creates a new Car inside the constructor
    public Traveler() {
        this.car = new Car(); // ❌ Problem: Traveler is stuck with Car
    }
    // 4️⃣Traveler starts journey with the Car
    public void startJourney() {
        this.car.move();
    }
}
