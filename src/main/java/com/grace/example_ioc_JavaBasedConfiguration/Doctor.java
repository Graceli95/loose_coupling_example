package com.grace.example_ioc_JavaBasedConfiguration;

public class Doctor {
    private String name;
    private Patient patient;
    public Doctor(String name, Patient patient) {
        this.name = name;
        this.patient = patient;
    }
    public String getDetails() {
        return "Doctor name: " + name + ", treating: " +
                patient.getDetails();
    }
}
