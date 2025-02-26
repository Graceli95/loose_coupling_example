package com.grace.useInterface_AchieveLooseCoupling_example;

// Implementation
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
