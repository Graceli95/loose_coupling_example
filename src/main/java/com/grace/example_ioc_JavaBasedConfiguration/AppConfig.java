package com.grace.example_ioc_JavaBasedConfiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean //1. **Defining a `Patient` Bean**
    public Patient patient() {
        return new Patient("John Doe");
    }

    @Bean  // **Defining a `Doctor` Bean**
    public Doctor doctor() {
        return new Doctor("Dr. Smith", patient());  //● The patient bean is injected into the doctor bean using method calls.
    }
}

/**
 * 1. **Inversion of Control (IoC)**:
 *     - Spring manages the creation and lifecycle of `Doctor` and `Patient` objects, instead of creating and wiring them manually.
 *
 * 1. **`@Configuration` Annotation**:
 *     - `@Configuration` is a Spring annotation that indicates that the class is used to define Spring beans.
 *     - It is part of **Java-based configuration** in Spring, where instead of XML configuration, you programmatically define beans and their dependencies in a class.
 *     - The `AppConfig` class is annotated with `@Configuration`, which tells Spring that this class contains bean definitions (methods annotated with `@Bean`).
 *
 * ### **How do `@Bean` Methods Work?**
 * 1. **Defining a `Patient` Bean**:
 *    @Bean
 *    public Patient patient() {
 *        return new Patient("John Doe");
 *    }
 *
 *  - The `patient` method is annotated with `@Bean`, meaning that Spring will manage the returned object (`Patient`) as a **Spring bean**.
 * - When the method is called by Spring, it returns an instance of the `Patient` class with `name = "John Doe"`.
 *
 * **Why is this important?**
 * - The method ensures that you don't have to manually instantiate the `Patient` object – Spring does it for you and ensures it's part of the container.
 *
 * - The `doctor` method is also annotated with `@Bean`, which makes Spring manage an instance of the `Doctor` class.
 * - It shows a dependency between `Doctor` and `Patient`. The `Doctor` bean depends on the `Patient` bean, so the method calls `patient()` to retrieve the managed `Patient` instance and inject it into `Doctor`.
 *
 * **Key Note:** Spring ensures the `patient()` method is only executed once, and its result is cached. This means the same instance of `Patient` is injected into `Doctor`.
 */