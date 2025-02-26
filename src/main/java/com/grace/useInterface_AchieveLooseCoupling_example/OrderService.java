package com.grace.useInterface_AchieveLooseCoupling_example;

// Client using interface (loose coupling)
public class OrderService {
    private final PaymentService paymentService;


    //Dependency Injection:
    // ***** By injecting an interface instead of a concrete class, you can easily swap implementations.
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;   // Dependency injected
    }

    public void checkout(double amount) {
        paymentService.processPayment(amount);
    }
}
//You can replace PayPalPaymentServiceImpl this implementation with CreditCardPaymentService without changing OrderService.

/**
 * How Interfaces Help Achieve Loose Coupling
 * Abstraction:
 * Interfaces define what a class should do, not how it does it. This lets you change the implementation without affecting the dependent classes.
 *
 * Dependency Injection:
 * By injecting an interface instead of a concrete class, you can easily swap implementations.
 */
