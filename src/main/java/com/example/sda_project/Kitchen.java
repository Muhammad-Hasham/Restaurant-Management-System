package com.example.sda_project;

import java.util.ArrayList;

public class Kitchen {
    ArrayList<Order> order = new ArrayList<>();

    public ArrayList<Order> getAllOrders() {
        return order;
    }

    public void LoadOrders(Factory factory){
        factory.Handler.ReadOrder(order);
    }

    public int[] returnIDs(ArrayList<Order> allOrders){
        int [] ids = new int[allOrders.size()];
        int count = 0;
        for (Order order : allOrders){
            ids[count] = order.getOrderId();
            count++;
        }
        return ids;
    }
    public int [] MakeOrder(int itemID[], int customerId , int quantity[], Factory factory) {
        int ids[] = returnIDs(order);
        int Details[] = new int[2];
        boolean flag = false;
        int orderID = factory.generateRandomId(ids);
        for (int i = 0; i < itemID.length; i++) {
            order.add(new Order(orderID, itemID[i], customerId, quantity[i]));
            factory.Handler.WriteOrder(order);

        }
        Details[0] = itemID.length;
        Details[1] = orderID;
        return Details;
    }
    public boolean cancelOrder(int Id , ArrayList<Order>order , Factory factory){
        boolean flag = false;
        for (int i =0; i<order.size(); i++){
            if (order.get(i).getOrderId() == Id){
                order.remove(i);
                --i;
                flag = true;
            }
        }
        factory.Handler.WriteOrder(order);
        return flag;
    }


}
