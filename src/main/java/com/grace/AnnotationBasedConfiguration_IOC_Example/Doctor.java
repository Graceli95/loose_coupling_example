package com.grace.AnnotationBasedConfiguration_IOC_Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //define and register a Java class as a Spring-managed component or bean. This allows the class to participate in Spring's dependency injection (DI) and container management system.
public class Doctor {
    private String name = "Dr. Brown";
    private final Patient patient;

    @Autowired //Constructor-based dependency injection
    public Doctor(Patient patient) {
        this.patient = patient;
    }
    public String getDetails() {
        return "Doctor name: " + name + ", treating: " + patient.getDetails();
    }
}

/**
 * ### Key Annotations Overview:
 * 1. **`@Component` **:
 *     - Marks a class as a Spring bean, which enables Spring to detect and manage it as part of the application context.
 *     - Used in both `Patient` and `Doctor` classes to register them as beans.
 *
 * 2. **`@Autowired` **:
 *     - Used in the `Doctor` class for constructor injection.
 *     - Automatically injects a matching `Patient` bean into the `Doctor` object during its initialization.
 *
 * By combining `@Autowired` with `@Component`, Spring provides a powerful mechanism for dependency injection, enabling loose coupling and better modularity in your application.
 *
 * The `@Autowired` annotation in Spring is used to enable automatic dependency injection.
 * It instructs the Spring container to automatically wire a specific dependency into a class (object) either through a constructor, a field, or a setter method.
 *
 * 1. **What `@Autowired` Does**:
 *     - The `@Autowired` annotation tells Spring to resolve and inject the appropriate bean into the class.
 *     - In this case, Spring will look in the application context for a bean of type `Patient` (as declared by `@Component` in `Patient.java`) and pass it into the `Doctor` class's constructor.
 *
 * 1. **How It Works in the Provided Code**:
 *     - The `Doctor` class is also marked with the `@Component` annotation, which registers it as a Spring-managed bean.
 *     - Since the `Patient` class is marked with `@Component`, it is also registered as a Spring bean.
 *     - When the Spring container initializes the `Doctor` bean, it detects the `@Autowired` annotation on the `Doctor` constructor.
 *     - It then finds a `Patient` bean in the container and injects it into the `Doctor` bean via the constructor.
 *
 * 2. **Benefits of Using `@Autowired`**:
 *     - Simplifies dependency injection by reducing the need for explicit bean declaration or manual wiring.
 *     - Promotes loose coupling between components since the dependencies are resolved at runtime by Spring, not directly within the code.
 *
 * 3. **Behavior in this Code**:
 *     - When `doctor.getDetails()` is called, the `Doctor` class uses its dependency on the `Patient` bean (injected via the constructor) to get the details of the `Patient`.
 *     - The `getDetails` method of the `Patient` class is invoked, which outputs `"Patient name: Jane Doe"`.
 *
 * 4. **Output**: Assuming you call a method like `doctor.getDetails()` after the Spring container initializes the beans, you would get:    Doctor name: Dr. Brown, treating: Patient name: Jane Doe
 */
