package com.grace.ex0c_IOC_loose_coupling;

import com.grace.ex0b_tight_coupling_single_class.Bike;

public class Traveler {
    private Vehicle vehicle;   // 2️⃣Can be a Car, Bike, or any future vehicle!

   // Constructor allows us to set any vehicle
    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;   // **** Dependency injected
    }

    //Traveler starts the journey using the chosen vehicle
    public void startJourney() {
        this.vehicle.move();
    }


}
