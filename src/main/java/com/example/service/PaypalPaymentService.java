package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    @Override
    public boolean makePayment(double amount) {
        try{
            System.out.println("Paypal payment Proceeded : "+amount);
            return true;
        } catch (Exception e) {
            System.out.println("Paypal Payment failed....");
        }
        return false;
    }
}
