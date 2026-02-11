package com.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaypalOrderService {
    private final PaymentService paymentService;

    public PaypalOrderService(
            @Qualifier("paypalPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public  void placeOrder(double amount){
        paymentService.makePayment(amount);
        System.out.println("PayPal order placed successfully.");
    }
}
