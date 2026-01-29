package com.example.service;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public boolean makePayment(double amount) {
        try{
            System.out.println("Credit Card payment proceeded : "+ amount);
            return true;
        } catch (Exception e) {
            System.out.println("Credit Card Payment failed....");
        }
        return false;
    }
}
