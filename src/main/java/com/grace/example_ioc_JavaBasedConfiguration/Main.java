package com.grace.example_ioc_JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Load the context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Doctor bean
        Doctor doctor = context.getBean(Doctor.class);

        // Use the bean
        System.out.println(doctor.getDetails());
    }
}

/**
 * - The `AnnotationConfigApplicationContext` is used to load the Spring container based on the `AppConfig` class, which contains the configuration for beans.
 * - Spring initializes the beans defined in `AppConfig` and wires their dependencies.
 *
 * -
 *     - The `AppConfig` configuration is passed to Spring's `AnnotationConfigApplicationContext`.
 *     - Beans are retrieved from the Spring container (e.g., `Doctor`).
 *     - The `getDetails` method is invoked on the `Doctor` bean to print doctor-patient information.
 */

