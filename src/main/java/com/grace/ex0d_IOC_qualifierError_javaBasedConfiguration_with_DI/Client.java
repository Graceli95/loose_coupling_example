package com.grace.ex0d_IOC_qualifierError_javaBasedConfiguration_with_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        // 1️⃣Create Spring IoC Container and load configuration from AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 2️⃣Get the Traveler bean (Spring automatically injects a Vehicle)
        Traveler traveler = context.getBean(Traveler.class);
        traveler.startJourney(); // Output depends on injected Vehicle (Car or Bike)
    }
}

//🎯 What Did We Learn?
//✅ Spring Injects Dependencies Automatically → No need to manually create objects!
//✅ Loose Coupling → Traveler can use any vehicle without code changes.
//✅ More Scalable → We can add an Airplane ✈️ easily in the future!
