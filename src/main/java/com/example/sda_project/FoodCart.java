package com.example.sda_project;

public class FoodCart {
    private int itemId;
    private int itemQuantity;

    public FoodCart(int itemId, int itemQuantity) {
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
    }

    public FoodCart() {
        itemId = -1;
        itemQuantity = -1;
    }

    public int getItemId() {
        return itemId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int quantity) {
        itemQuantity = quantity;
    }
}
