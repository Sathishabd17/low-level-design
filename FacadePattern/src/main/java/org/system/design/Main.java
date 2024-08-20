package org.system.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderFood();
    }
}