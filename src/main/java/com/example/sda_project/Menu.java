package com.example.sda_project;

import java.util.ArrayList;

public class Menu {
    ArrayList<Item> items = new ArrayList<>();
    public void loadItems(Factory factory){
        factory.Handler.ReadItem(items);
    }
    public ArrayList<Item> showMenu(ArrayList<Item> AllItems){
        return AllItems;
    }

    public boolean addItem(String Name, String description, double price, Factory factory){
        int ids[] = returnIDs(items);
        Factory f = new Factory();
        boolean flag = false;
        int ItemID = f.generateRandomId(ids);
        items.add(new Item(ItemID , new ItemDescription(Name , description , price)));
        factory.Handler.WriteItem(items);
        return true;
    }
    public boolean deleteItem(int ItemId  , Factory factory){
        for (int i = 0; i<items.size(); i++){
            if (ItemId == items.get(i).getItemId()){
                items.remove(i);
                factory.Handler.WriteItem(items);
                return true;
            }
        }
        return false;
    }
    public boolean editItem(int ItemId , String Name , String Description , double price,
                            Factory factory){
        for (int i = 0; i<items.size(); i++){
            if (ItemId == items.get(i).getItemId()){
                items.get(i).setItemId(ItemId);
                items.get(i).getItemDescription().setItemName(Name);
                items.get(i).getItemDescription().setItemDescription(Description);
                items.get(i).getItemDescription().setItemPrice(price);
                factory.Handler.WriteItem(items);
                return true;
            }
        }
        return false;
    }
    public int[] returnIDs(ArrayList<Item> allItems){
        int [] ids = new int[allItems.size()];
        int count = 0;
        for (Item item : allItems){
            ids[count] = item.getItemId();
            count++;
        }
        return ids;
    }


}
