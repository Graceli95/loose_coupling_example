package com.grace.AnnotationBasedConfiguration_IOC_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the context using annotation-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Doctor bean
        Doctor doctor = context.getBean(Doctor.class);

        // Use the bean
        System.out.println(doctor.getDetails());
    }
}
