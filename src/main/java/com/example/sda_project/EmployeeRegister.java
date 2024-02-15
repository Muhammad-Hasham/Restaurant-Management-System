package com.example.sda_project;

import java.util.ArrayList;

public class EmployeeRegister {

    ArrayList<Employee> employees = new ArrayList<>();

    public void loadEmployeeData(Factory factory){
        factory.Handler.ReadEmployeeData(employees);
    }
    private boolean checkId(int managerId) {
        for (Employee Employee: employees  ) {
            if (Employee.getEmployeeId() == managerId) {
                return true;
            }
        }
        return false;
    }
    private boolean checkPass(String pass){
        for (Employee Employee: employees ) {
            if (Employee.getPassword().equalsIgnoreCase(pass)){
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
}
