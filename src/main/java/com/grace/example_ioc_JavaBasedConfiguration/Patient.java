package com.grace.example_ioc_JavaBasedConfiguration;

public class Patient {
    private String name;
    public Patient(String name) {
        this.name = name;
    }
    public String getDetails() {
        return "Patient name: " + name;
    }
}
