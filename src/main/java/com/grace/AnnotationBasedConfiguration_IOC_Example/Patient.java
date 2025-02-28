package com.grace.AnnotationBasedConfiguration_IOC_Example;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    private String name = "Jane Doe";
    public String getDetails() {
        return "Patient name: " + name;
    }
}
