package com.grace.ex0d_IOC_loose_coupling_javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        // 1️⃣Create Spring IoC Container and load configuration from AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 2️⃣Get the Car bean from Spring
        Vehicle car = context.getBean("car", Vehicle.class);
        car.move();  // Output: Car is moving ..

        // 3️⃣Get the Bike bean from Spring
        Vehicle bike = context.getBean("bike", Vehicle.class);
        bike.move(); // Output: Bike is moving ..
    }
}
//🎯 What Did We Learn?
//✅ Java-based Spring Configuration → We manually created beans using @Bean.
//✅ Spring manages objects → We did not create objects manually in Client.java.
//✅ Flexible & Scalable → We can add new vehicles easily without changing the client code!

//🎉 Congratulations! You have successfully built a Java-based Spring project with manual bean configuration!


/**
 * ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 * - Instantiates a Spring IoC container.
 * - Configures it using the `AppConfig` class.
 * - Prepares the application by loading beans defined in `AppConfig`.
 *
 * This is the foundation for a **Java-based, loose-coupled Spring application configuration**.
 *
 * ### Explanation:
 * 1. **`ApplicationContext` **:
 *     - It is a core interface provided by the Spring Framework.
 *     - It represents the **Spring IoC container** that is responsible for managing and configuring application objects (a.k.a **Spring beans**) defined in the configuration.
 *
 * 2. **`AnnotationConfigApplicationContext` **:
 *     - This is a specific implementation of `ApplicationContext`.
 *     - It is used to bootstrap the Spring IoC container using a **Java-based configuration class** (as opposed to XML-based configuration).
 *     - It scans and processes Java classes annotated with Spring-specific annotations (like `@Configuration`, `@Bean`, and others) to register beans in the IoC container.
 *
 * 3. **`AppConfig.class` **:
 *     - `AppConfig` is a user-defined class annotated with `@Configuration`, which indicates that this class contains **bean definitions**.
 *     - The `@Configuration` annotation signifies that the class defines application context configuration in a programmatic, Java-based way.
 *     - Methods within this class annotated with `@Bean` define bean definitions. These beans are registered with the IoC container and managed by Spring.
 *
 * 4. **What the Code Does**:
 *     - When `new AnnotationConfigApplicationContext(AppConfig.class)` is executed:
 *         1. A new Spring IoC container (`context`) is created.
 *         2. The container reads the `AppConfig` configuration class.
 *         3. The `@Bean` annotations in `AppConfig` are processed (e.g., `car()` and `bike()` methods).
 *         4. Spring creates and registers these bean instances (`Car` and `Bike` objects implementing `Vehicle`) into the container.
 *         5. The container is now ready to provide these beans on request.
 *
 * 5. **Why Use This?**
 *     - This approach uses **Java-based configuration**, which is type-safe, strongly-typed, and easier to maintain compared to traditional XML-based configuration.
 *     - It allows developers to configure Spring applications purely using Java syntax without relying on external XML files.
 *
 * ### Diagrammatic Flow:
 * 1. The program initiates the Spring IoC container using `AnnotationConfigApplicationContext`.
 * 2. The class `AppConfig` (annotated with `@Configuration`) is scanned.
 * 3. Spring detects `@Bean` in the configuration:
 *     - Calls `car()` and `bike()` methods.
 *     - Registers the `Car` and `Bike` instances as beans in the `ApplicationContext`.
 *
 * 4. The beans are now available for retrieval using `context.getBean()`.
 *
 * ### Process in the Complete Example:
 * - `ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);`
 *     - Creates the container and loads configuration from `AppConfig`.
 *
 * - **`context.getBean("car", Vehicle.class)`**:
 *     - Fetches the bean with the name `"car"` (created by the `car()` method in `AppConfig`) and type `Vehicle`.
 *     - Calls the `move()` method of `Car`, which prints:     Car is moving ..
 *
 * - **`context.getBean("bike", Vehicle.class)`**:
 *     - Fetches the bean `"bike"` (created by the `bike()` method in `AppConfig`) and type `Vehicle`.
 *     - Calls the `move()` method of `Bike`, which prints:     Bike is moving ..
 *
 * ### Key Benefits of this Approach:
 * 1. **Decoupling**:
 *     - The objects (`Car`, `Bike`) are not directly instantiated or referenced in the client (`Client` class). Spring handles their lifecycle and dependency management.
 *
 * 2. **Configurable**:
 *     - Adding or modifying beans is centralized within the configuration (`AppConfig`).
 *
 * 3. **Testable**:
 *     - Easier to write test cases as you can isolate the configuration or use different configurations.
 */