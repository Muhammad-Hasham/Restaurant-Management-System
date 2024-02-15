package com.example.sda_project;

public class Order {
    private int orderId;
    private int quantity;
     Item item = new Item();
    Customer customer = new Customer();


    public Order(int orderId, int itemId, int customerId , int quantity){
        this.orderId = orderId;
        item.setItemId(itemId);
        customer.setCustomerId(customerId);
        this.quantity = quantity;
    }

    public Order() {
        orderId = -1;
        quantity = -1;
        item = null;
        customer = null;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }


}
