package com.example;

import com.example.config.AppConfig;
import com.example.service.OrderService;
import com.example.service.PaypalOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("P101", 1000.0);

        PaypalOrderService paypalOrderService = context.getBean(PaypalOrderService.class);
        paypalOrderService.placeOrder(500);
    }
}
