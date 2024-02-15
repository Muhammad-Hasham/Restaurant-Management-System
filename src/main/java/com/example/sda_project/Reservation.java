package com.example.sda_project;

public class Reservation {
    private String date;
    private String time;
    Customer customer = new Customer();
    Table table = new Table();


    public Reservation(String date, String time, int customerID, int tableId) {
        this.date = date;
        this.time = time;
        this.customer.setCustomerId(customerID);
        this.table.setTableId(tableId);
    }

    public Reservation() {
        date = null;
        time = null;
        customer.setCustomerId(-1);
        table.setTableId(-1);
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Table getTable() {
        return table;
    }
}
