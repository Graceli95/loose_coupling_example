package com.grace.ex0c_IOC_loose_coupling;

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike is moving ..");
    }
}
