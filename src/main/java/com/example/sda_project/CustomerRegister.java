package com.example.sda_project;

import java.util.ArrayList;

public class CustomerRegister {
    ArrayList<Customer> customerDetails = new ArrayList<>();
    public void LoadCustomerData(Factory factory){
        factory.Handler.ReadCustomer(customerDetails);
    }
    private boolean checkId(int CustomerId) {
        for (Customer customer : customerDetails) {
            if (customer.getCustomerId() == CustomerId) {
                return true;
            }
        }
        return false;
    }
    private boolean checkPass(String pass){
        for (Customer customer: customerDetails) {
            if (customer.getPassword().equalsIgnoreCase(pass)){
                return true;
            }
        }
        return false;
    }


    public boolean login(int id, String pass) {
        if (checkId(id) && checkPass(pass)) {
            return true;
        }
        return false;
    }
    public boolean signUp(int CustomerId , String Pass, String Name, String Number , Factory factory) {
        if (!checkId(CustomerId)) {
            customerDetails.add(new Customer(CustomerId, Pass, Name, Number));
            factory.Handler.AddACustomer(new Customer(CustomerId, Pass, Name, Number));
            return true;
        }
        else return false;
    }


}
