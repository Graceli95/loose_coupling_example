package com.grace.ex0b_tight_coupling_single_class;

public class Client {
    public static void main(String[] args) {
       // 2️⃣Traveler goes on a journey (by default, using Bike)
        Traveler traveler = new Traveler();
        traveler.startJourney(); // Output: Bike is moving ..
    }
}
