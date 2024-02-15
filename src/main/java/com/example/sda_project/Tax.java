package com.example.sda_project;

public class Tax {
    final static double Tax = 0.17;
    public double[] calculateTax(double  Amount){
        double tax = Amount*Tax;
        double amountWithTax = Amount + tax;
        double Bill[] = {amountWithTax , tax};
        return Bill;
    }
}
