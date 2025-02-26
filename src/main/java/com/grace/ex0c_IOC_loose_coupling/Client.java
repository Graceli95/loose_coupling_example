package com.grace.ex0c_IOC_loose_coupling;


public class Client {
    public static void main(String[] args) {

        //1. Traveler wants to use a Bike
        Vehicle currentMovingVehicle = new Bike();
        Traveler traveler1 = new Traveler(currentMovingVehicle);
        traveler1.startJourney(); // Output: Bike is moving ..

        //2. Traveler wants to use a Car
//        Vehicle car = new Car();
//        Traveler traveler2 = new Traveler(car);
//        traveler2.startJourney(); // Output: Car is moving ..
    }
}
