package javacore.enums.domain;
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
public enum OrderStatus {
    WAITING,
    PREPARING,
    READY,
    DELIVERED,
    CANCELLED;


}
