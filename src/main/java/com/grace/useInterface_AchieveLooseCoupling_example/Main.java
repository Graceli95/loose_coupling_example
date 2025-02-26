package com.grace.useInterface_AchieveLooseCoupling_example;

public class Main {
    public static void main(String[] args) {

        // Create a concrete implementation of the PaymentService interface
        PaymentService paypalPaymentServiceImpl = new PayPalPaymentService();

        // Inject the implementation into the OrderService (Dependency Injection)
        OrderService orderService = new OrderService(paypalPaymentServiceImpl);

        // Perform a checkout using the injected PaymentService
        orderService.checkout(100.50); //example amount


        //easily swap services in the main:
        PaymentService creditCardPaymentService = new CreditCardPaymentService(); // Create a concrete implementation of the PaymentService interface
        OrderService creditCardOrderService = new OrderService(creditCardPaymentService);  // Inject the implementation into the OrderService (Dependency Injection)
        creditCardOrderService.checkout(75.25); // Perform a checkout using the injected PaymentService

    }
}

/**
 * 🚀 What’s Happening Here?
 * PayPalPaymentService instance is created:
 * This provides the actual payment processing logic.
 *
 * OrderService receives PaymentService through its constructor:
 * This demonstrates Dependency Injection, which promotes loose coupling.
 * 👉 If you later decide to use another payment service (e.g., CreditCardPaymentService), you don’t need to change OrderService.
 *
 * checkout method is called:
 * It calls processPayment on the injected PaymentService without caring about its actual implementation.
 *
 * The main method demonstrates how loose coupling allows flexible and interchangeable components without modifying the OrderService class. Just change the implementation passed to it! 🎯
 */
