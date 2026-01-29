package com.example.service;

public class PaypalPaymentService implements PaymentService{
    @Override
    public boolean makePayment(double amount) {
        try{
            System.out.println("Paypal payment Proceeded : "+amount);
        } catch (Exception e) {
            System.out.println("Paypal Payment failed....");
        }
        return false;
    }
}
