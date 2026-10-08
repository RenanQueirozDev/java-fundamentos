package javacore.enums.domain;
/*
/*
Create an enum called OrderStatus with the following values:
WAITING
PREPARING
READY
DELIVERED
CANCELLED
Create a class order with:
An int attribute orderNumber
An attribute of type OrderStatus
A constructor that receives both attributes
A method displayStatus() that prints to the console: "order #X - Status: Y"
In main, create two orders with different statuses and call displayStatus() on each.
 */

public class Order {
    private int orderNumber;
    private OrderStatus orderStatus;

    public Order(int orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return " Order Number = " + orderNumber +
                 " Order Status = " + orderStatus;
    }
    public void displayStatus() {
        System.out.println("Order is = " + orderNumber + "\n" + "Status is = " + getOrderStatus());
    }
}
