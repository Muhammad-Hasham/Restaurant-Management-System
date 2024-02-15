package com.example.sda_project;

import java.util.ArrayList;

public class BillCounter {

    ArrayList<Bill> AllBills = new ArrayList<>();
    public double [] generateBill(ArrayList<Order> allOrders, int orderId , ArrayList<Item> AllItems, Factory factory) {
        Bill bill = new Bill();
        double Bill[] = new  double[3];
        for (int i = 0; i < allOrders.size(); i++) {
            if (allOrders.get(i).getOrderId() == orderId) {
                for (int j = 0; j<AllItems.size(); j++){
                    if (AllItems.get(j).getItemId() == allOrders.get(i).item.getItemId()){
                        bill.setAmount(bill.getAmount() + AllItems.get(j).getItemDescription().getItemPrice()
                                * allOrders.get(i).getQuantity());
                    }
                }
            }
        }
        Tax tax = new Tax();
        double[] tempBill = tax.calculateTax(bill.getAmount());
        int ids[] = returnIDs();
        AllBills.add(new Bill(Bill[0], factory.generateRandomId(ids)));
        Bill[0] = tempBill[0];
        Bill[1] = tempBill[1];
        Bill[2] = orderId;
        return Bill;
    }
    public int[] returnIDs(){
        int [] ids = new int[AllBills.size()];
        int count = 0;
        for (Bill bills : AllBills){
            ids[count] = bills.getBillId();
            count++;
        }
        return ids;
    }
}
