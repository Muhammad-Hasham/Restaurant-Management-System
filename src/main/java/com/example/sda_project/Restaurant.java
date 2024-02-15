package com.example.sda_project;

import java.util.ArrayList;

public class Restaurant {
  private  CustomerRegister c = new CustomerRegister();
    private Customer C = new Customer();
   private EmployeeRegister e = new EmployeeRegister();
   private  Inventory i = new Inventory();
   private Kitchen k = new Kitchen();

   private DiningHall h = new DiningHall();
   private  ReceptionCounter r  = new ReceptionCounter();
 private   Factory factory = new Factory();
   private Menu menu = new Menu();
   private Manager m = new Manager();
 private   BillCounter b = new BillCounter();
    private  Feedback fb = new Feedback();
   private Payroll p = new Payroll();
    private ArrayList<FoodCart> cart = new ArrayList<>();

    public ArrayList<FoodCart> getCart() {
        return  cart ;
    }

    private FoodCart Cart = new FoodCart();
   private Employee E;
   private double [] bill;
   private int cusID , tableId;
   private int []OrderDetails;
   private int R;

    public int[] getOrderDetails() {
        return OrderDetails;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void loadFiles() {


        c.LoadCustomerData(factory);
        e.loadEmployeeData(factory);
        menu.loadItems(factory);
        k.LoadOrders(factory);
        h.LoadTableData(factory);
        r.LoadReservations(factory);
    }

    public boolean LoginCustomer(int id , String pass){
        return c.login(id,pass);
    }
    public boolean LoginEmployee(int id , String pass){
    return e.login(id,pass);

    }
    public boolean RestockIngredient(int id , int quantity){
        return i.reStockIngredients(id , quantity, factory);
    }
    public boolean AddItem(String name, String description , double price) {
        return menu.addItem(name,description,price,factory);
    }
    public boolean DeleteItem(int id) {
        return menu.deleteItem(id,factory);
    }
    public boolean EditItem(int id ,String name ,String description , double price) {
        return menu.editItem(id,name,description,price,factory);
    }
    public boolean CancelOrder(int Id){
        return k.cancelOrder(Id,k.order,factory);
    }
    public boolean computeSalary(int id) {

        E = p.computeSalary(id, e.employees, factory);
        if (E == null) {
            return false;
        }
        return true;
    }
    public Employee employeeData(){
        return E;
    }


    public ArrayList<Table> ShowAllTables() {
     return h.tables;
    }
    public ArrayList<Order> getAllOrders(){return k.getAllOrders();}

          public boolean makeReservation(int Cid , int tId , String Date, String time){
            R=this.r.makeReservation(Cid , tId , Date , time , h.tables , factory);
            return true;
        }
        public int returnID(){return R;}
        public boolean CancelReservation(int TableId){
        return r.cancelReservation(TableId, h.tables,factory);
}


    public ArrayList<Item> ShowMenu(){
        return menu.items;
    }
    public boolean makeOrder(int ArrayOfItem[] ,int ArrayOfQuantity [] , int customerId){
        OrderDetails = k.MakeOrder(ArrayOfItem , customerId , ArrayOfQuantity , factory);
        cart.removeAll(cart);
        return true;
    }
    public boolean cancelOrder(int orderId){
        return k.cancelOrder(orderId,k.order,factory);
    }

    public boolean Feedback(String feedback){
        return C.GiveFeedback(feedback,factory,m.AllFeedBack);
    }

    public void GenerateBill(int OrderID){
        bill = this.b.generateBill(k.order , OrderID , menu.items , factory) ;
    }
    public double [] returnBill(){
        return bill;
    }
    public boolean removeFromCart(int id , int quantity){
        boolean flag = false;
        for (int i = 0; i<cart.size(); i++){
            if (cart.get(i).getItemId() == id){
                if(cart.get(i).getItemQuantity() - quantity == 0){
                    cart.remove(i);
                }
                else
                    cart.get(i).setItemQuantity(cart.get(i).getItemQuantity() - quantity);
                flag = true;

            }
        }
        return flag;
    }
    public boolean addToCart(int itemID , int quantity){
        cart.add(new FoodCart(itemID , quantity));
        return true;
    }
    public int[] GetItemArray() {
        int[] ItemId = new int[cart.size()];
        for (int i = 0; i < cart.size(); i++) {
            ItemId[i] = cart.get(i).getItemId();
        }
        return ItemId;
    }
    public int [] GetQuantityArray(){
       int Quantity []= new int[cart.size()];
        for (int i = 0; i<cart.size(); i++){
            Quantity[i] = cart.get(i).getItemQuantity();
        }
        return Quantity;
    }
}
