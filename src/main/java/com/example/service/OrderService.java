package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
private  final PaymentService paymentService;
private final InventoryService inventoryService;

public  OrderService(PaymentService paymentService,InventoryService inventoryService){
    this.inventoryService=inventoryService;
    this.paymentService=paymentService;
}
public void placeOrder(String ProductId,double amount){
    inventoryService.checkAvailablilty(ProductId);
    paymentService.makePayment(amount);
    System.out.println("Order Placed Successfully");
}
}
