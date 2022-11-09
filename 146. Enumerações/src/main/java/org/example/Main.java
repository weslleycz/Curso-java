package org.example;

import java.util.Date;

import entities.Order;
import entities_Enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DEVILERED;
        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");

        System.out.println(os2.toString());
    }
}