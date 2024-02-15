package com.example.sda_project;

public class ItemDescription {
    private String ItemName;
    private String ItemDescription;
    private double itemPrice;

    public double getItemPrice() {
        return itemPrice;
    }

    public ItemDescription(String itemName, String itemDescription, double itemPrice) {
        ItemName = itemName;
        ItemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public ItemDescription() {
        ItemName = null;
        ItemDescription = null;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

}
