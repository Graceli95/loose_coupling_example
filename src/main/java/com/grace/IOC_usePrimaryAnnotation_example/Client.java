package com.grace.IOC_usePrimaryAnnotation_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        // 1️⃣Create Spring IoC Container and load configuration from AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 2️⃣Get the Traveler bean (Spring injects the @Primary vehicle)
        Traveler traveler = context.getBean(Traveler.class);
        traveler.startJourney();  // Output: Car is moving ..
    }
}
