package com.grace.ex0b_tight_coupling_single_class;

public class Traveler {
    private Bike bike;

    public Traveler() {
        // this.car = new Car(); // Traveler was using Car (commented out)
        this.bike = new Bike();
    }

    public void startJourney() {
    // this.car.move(); // If using Car
        this.bike.move(); // Using Bike
    }


}
