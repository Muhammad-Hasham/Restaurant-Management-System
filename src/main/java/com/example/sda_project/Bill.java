package com.example.sda_project;

public class Bill {
    private double Amount;
    private int BillId;

    public void setAmount(double amount) {
        Amount = amount;
    }
    public double getAmount() {
        return Amount;
    }
    public int getBillId() {
        return BillId;
    }

    public Bill(double amount, int billId) {
        Amount = amount;
        BillId = billId;
    }

    public Bill() {
        Amount = -1;
        BillId = -1;
    }
}
