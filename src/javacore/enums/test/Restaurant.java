package javacore.enums.test;

import javacore.enums.domain.Order;
import javacore.enums.domain.OrderStatus;

public class Restaurant {
    public static void main(String[] args) {
        Order order = new Order(12,OrderStatus.CANCELLED);
        order.displayStatus();
    }
}
