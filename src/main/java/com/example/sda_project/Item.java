package com.example.sda_project;

public class Item {
    private int ItemId;
    private ItemDescription itemDescription = new ItemDescription();

    public Item(int itemId ,  ItemDescription itemDescription) {
        ItemId = itemId;
        this.itemDescription = itemDescription;
    }
    public Item (){
        ItemId = -1;
        itemDescription = null;
    }


    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public int getItemId() {
        return ItemId;
    }

}
