package com.example.sda_project;

public class Employee {
    private int EmployeeId;
    private String Password;
    private double Salary;
    private int totalHoursWorked;
    private String Name;
    private String Month;
    static final int HourlyWage = 1000;

    public Employee() {
    }

    public Employee(int employeeId, String password, double salary, int totalHoursWorked, String name, String month) {
        EmployeeId = employeeId;
        Password = password;
        Salary = salary;
        this.totalHoursWorked = totalHoursWorked;
        Name = name;
        Month = month;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public String getPassword() {
        return Password;
    }

    public double getSalary() {
        return Salary;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public String getName() {
        return Name;
    }

    public String getMonth() {
        return Month;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
