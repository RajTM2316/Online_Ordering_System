package com.example.service;

public class product {
    int productId;
    String ProductName;

    public product(){}

    public product(int productId,String ProductName){
        this.productId=productId;
        this.ProductName=ProductName;
    }

    @Override
    public String toString() {
        return (this.productId + " " + this.ProductName);
    }
}
