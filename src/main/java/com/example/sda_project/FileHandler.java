package com.example.sda_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.BufferOverflowException;
import java.util.ArrayList;

public class FileHandler implements PersistenceHandler {


    @Override
    public boolean AddACustomer(Customer c) {
        try{
            FileWriter Write = new FileWriter("Customer.txt",true);
            BufferedWriter buff = new BufferedWriter(Write);
            buff.write(c.getCustomerId() + "," + c.getPassword() + "," +  c.getCustomerName() + "," + c.getContactNumber() + "\n" );
            buff.close();
            return true;
        }catch (Exception e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
        return false;
    }

    @Override
    public boolean ReadCustomer(ArrayList<Customer> DataLoader) {
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Customer.txt"));
            String customer;
            while ((customer = buff.readLine())!= null){
                String [] Data = customer.split(",");
                int Id = Integer.parseInt(Data[0]);
                String Pass = Data[1];
                String Name =  Data[2];
                String ContactNumber = Data[3];
                DataLoader.add(new Customer(Id , Pass , Name , ContactNumber));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean AddAEmployee(ArrayList<Employee> E) {
        try{
            BufferedWriter buff = new BufferedWriter(new FileWriter("Employee.txt"));
            for (Employee e : E )
            buff.write(e.getEmployeeId()+ "," + e.getPassword() + "," +  e.getTotalHoursWorked() + "," + e.getSalary() +
                    "," + e.getName() + "," +  e.getMonth()+ "\n" );
            buff.close();
            return true;
        }catch (Exception e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
        return false;
    }
    @Override
    public boolean ReadEmployeeData(ArrayList<Employee> E){
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Employee.txt"));
            String Employee;
            while ((Employee = buff.readLine())!= null){
                String [] Data = Employee.split(",");
                int Id = Integer.parseInt(Data[0]);
                String Pass = Data[1];
                double salary = Double.parseDouble(Data[3]);
                int totalHoursWorked = Integer.parseInt(Data[2]);
                String name = Data[4];
                String Month =  Data[5];
                E.add(new Employee(Id , Pass , salary ,  totalHoursWorked , name , Month));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    @Override
    public boolean ReadTable(ArrayList<Table> T){
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Table.txt"));
            String Table;
            while ((Table = buff.readLine())!= null){
                String [] Data  =  Table.split(",");
                int Id = Integer.parseInt(Data[0]);
                Boolean IsReserved = Boolean.parseBoolean(Data[1]);
                int NoOfChairs = Integer.parseInt(Data[2]);
                T.add(new Table(Id , IsReserved , NoOfChairs));
            }
            return  true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    @Override
    public boolean ReadIngredient(ArrayList<Ingredients> AllIngredients){
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Ingredient.txt"));
            String Ingredients;
            while ((Ingredients = buff.readLine())!= null){
                String [] Data  =  Ingredients.split(",");
                int Id = Integer.parseInt(Data[0]);
                int Quantity = Integer.parseInt(Data[1]);
                AllIngredients.add(new Ingredients(Id,Quantity));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean WriteIngredient(Ingredients I) {
        try{
            FileWriter Write = new FileWriter("Ingredient.txt",true);
            BufferedWriter buff = new BufferedWriter(Write);
            buff.write(I.getIngredientId() + "," + I.getQuantity() + "\n" );
            buff.close();
            return true;
        }catch (Exception e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
        return false;
    }

    @Override
    public boolean ReadItem(ArrayList<Item> items){
            try {
                BufferedReader buff= new BufferedReader(new FileReader("Item.txt"));
                String Items;
                while ((Items = buff.readLine())!= null){
                    String [] Data  =  Items.split(",");
                    int Id = Integer.parseInt(Data[0]);
                    String name = Data[1];
                    String Description = Data[2];
                    double price = Double.parseDouble(Data[3]);
                    items.add(new Item(Id,new ItemDescription( name , Description , price)));
                }
                return true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return false;

    }
    @Override
    public boolean WriteItem(ArrayList<Item> items){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Item.txt"));
            for (Item item: items){
                writer.write(item.getItemId() + "," + item.getItemDescription().getItemName() +
                        "," + item.getItemDescription().getItemDescription() + ","
                        + item.getItemDescription().getItemPrice() + "\n");
            }
            writer.close();
            return true;
        }
        catch(Exception E){
            System.out.println(E);
        }
        return false;
    }
    @Override
    public boolean WriteFeedBack(Feedback F){
        try{
            FileWriter Write = new FileWriter("FeedBack.txt",true);
            BufferedWriter buff = new BufferedWriter(Write);
            buff.write(F.getFeedBack() + "\n" );
            buff.close();
            return true;
        }catch (Exception e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
        return false;
    }
    @Override
    public boolean WriteOrder(ArrayList<Order> order){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Order.txt"));
            for (Order orders: order){
                writer.write(orders.getOrderId()+ "," +
                        orders.item.getItemId() + "," + orders.customer.getCustomerId() + "," + orders.getQuantity() +  "\n");
            }
            writer.close();
            return true;
        }
        catch(Exception E){
            System.out.println(E);
        }
        return false;
    }
    @Override
    public boolean ReadOrder(ArrayList<Order> order){
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Order.txt"));
            String orders;
            while ((orders = buff.readLine())!= null){
                String [] Data  =  orders.split(",");
                int OId = Integer.parseInt(Data[0]);
                int IiD = Integer.parseInt(Data[1]);
                int CId = Integer.parseInt(Data[2]);
                int quantity = Integer.parseInt(Data[3]);
                order.add(new Order(OId ,IiD ,  CId  , quantity));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean WriteReservation(ArrayList<Reservation> reservations){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Reservation.txt"));
            for (Reservation reservation: reservations){
                writer.write(reservation.getDate() + "," + reservation.getTime() + "," + reservation.getCustomer().getCustomerId() +
                "," + reservation.getTable().getTableId() + "\n");
            }
            writer.close();
            return true;
        }
        catch(Exception E){
            System.out.println(E);
        }
        return false;
    }
    public boolean ReadReservation(ArrayList<Reservation> reservations){
        try {
            BufferedReader buff= new BufferedReader(new FileReader("Reservation.txt"));
            String reservation;
            while ((reservation = buff.readLine())!= null){
                String [] Data  =  reservation.split(",");
                String Date = Data[0];
                String time = Data[1];
                int cid = Integer.parseInt(Data[2]);
                int tId = Integer.parseInt(Data[3]);
                reservations.add(new Reservation(Date , time , cid , tId));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }


}
