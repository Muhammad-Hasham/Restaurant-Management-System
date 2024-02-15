package com.example.sda_project;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface PersistenceHandler {
    public abstract boolean AddACustomer(Customer customer);
    public abstract boolean ReadCustomer(ArrayList<Customer> DataLoader);
    public abstract boolean AddAEmployee(ArrayList<Employee> E);
    public abstract boolean ReadEmployeeData(ArrayList<Employee> E);
    public abstract boolean ReadTable(ArrayList<Table> T);
    public abstract boolean ReadIngredient(ArrayList<Ingredients> I);

    public abstract boolean WriteIngredient(Ingredients I);

    public abstract boolean ReadItem(ArrayList<Item> I);
    public abstract boolean WriteItem(ArrayList<Item> I);
    public abstract boolean WriteFeedBack(Feedback f);
    public abstract boolean WriteOrder(ArrayList<Order> o);
    public abstract boolean ReadOrder(ArrayList<Order> o);
    public abstract boolean WriteReservation(ArrayList<Reservation>r);
    public abstract boolean ReadReservation(ArrayList<Reservation>r);

}
