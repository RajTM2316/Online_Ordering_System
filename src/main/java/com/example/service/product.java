package com.example.service;

public class product {
    String productId;
    String ProductName;
    double amount;

    public product(){}

    public product(String productId,String ProductName,double amount){
        this.productId=productId;
        this.ProductName=ProductName;
        this.amount=amount;
    }
    public product(String productId,double amount){
        this.productId=productId;
        this.amount=amount;
    }
    @Override
    public String toString() {
        return (this.productId + " " + this.ProductName);
    }
}
