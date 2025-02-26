package com.grace.useInterface_AchieveLooseCoupling_example;

// Client using interface (loose coupling)
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;   // Dependency injected
    }

    public void checkout(double amount) {
        paymentService.processPayment(amount);
    }
}
//You can replace PayPalPaymentServiceImpl this implementation with CreditCardPaymentService without changing OrderService.

