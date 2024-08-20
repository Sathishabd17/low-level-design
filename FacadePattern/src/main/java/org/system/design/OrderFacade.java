package org.system.design;

public class OrderFacade {

    private Waiter waiter;
    private Kitchen kitchen;

    public OrderFacade() {
        this.waiter = new Waiter();
        this.kitchen = new Kitchen();
    }

    public void orderFood() {
        waiter.writeOrder();
        waiter.sendToKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serveCustomer();
        kitchen.washDishes();
    }
}
