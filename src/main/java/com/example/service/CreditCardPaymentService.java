package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CreditCardPaymentService implements PaymentService{
    @Override
    public boolean makePayment(double amount) {
        try{
            System.out.println("Credit Card payment proceed : "+ amount);
            return true;
        } catch (Exception e) {
            System.out.println("Credit Card Payment failed....");
        }
        return false;
    }
}
