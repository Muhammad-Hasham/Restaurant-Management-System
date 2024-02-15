package com.example.sda_project;

import java.util.ArrayList;

public class Payroll {
    public Employee computeSalary(int id , ArrayList<Employee> AllEmployees, Factory factory){
        for (Employee Employees: AllEmployees){
            if (Employees.getEmployeeId() == id){
                Employees.setSalary(Employees.getTotalHoursWorked()* Employee.HourlyWage);
                factory.Handler.AddAEmployee(AllEmployees);
                return Employees;
            }
        }
        return null;
    }
}
