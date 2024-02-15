package com.example.sda_project;

import java.util.ArrayList;

public class Customer {
    private int CustomerId;
    private String CustomerName;
    private String ContactNumber;
    private String Password;
    public String getCustomerName() {
        return CustomerName;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }
    public Customer(int CustomerId, String Password, String CustomerName, String ContactNumber) {
        this.CustomerName  = CustomerName;
        this.Password = Password;
        this.CustomerId = CustomerId;
        this.ContactNumber = ContactNumber;
    }
    public Customer(){
        CustomerId = -1;
        Password = null;
        CustomerName = null;
        ContactNumber  = null;

    }
    public boolean GiveFeedback(String Feedback , Factory factory , ArrayList<Feedback> feedbacks){
        feedbacks.add(new Feedback(Feedback));
        if(factory.Handler.WriteFeedBack(new Feedback(Feedback)))
            return true;
        else return  false;
    }


}

