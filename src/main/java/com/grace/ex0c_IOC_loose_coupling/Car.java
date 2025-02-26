package com.grace.ex0c_IOC_loose_coupling;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Car is moving ..");
    }
}
