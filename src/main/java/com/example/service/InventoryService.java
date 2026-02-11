package com.example.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InventoryService {

    public void checkAvailablilty(String prouductId){
        System.out.println("Checking Availibility for product: "+prouductId);
    }
}
