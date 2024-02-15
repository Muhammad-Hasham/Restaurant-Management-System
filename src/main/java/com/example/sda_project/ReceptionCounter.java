package com.example.sda_project;

import java.util.ArrayList;

public class ReceptionCounter {
    ArrayList<Reservation> Reservations = new ArrayList<>();
    public void LoadReservations(Factory factory){
        factory.Handler.ReadReservation(Reservations);
    }
    public int makeReservation(int customerId, int tableId, String Date, String Time, ArrayList<Table> AllTables, Factory factory){
        boolean flag = false;
        for (Table Tables: AllTables){
            if (Tables.getTableId() == tableId){
                for (int i = 0; i<Reservations.size(); i++) {
                    if (Reservations.get(i).getTable().getTableId() == tableId) {
                        flag = true;
                    }
                }
                if(!flag) {
                    Tables.setReserved(true);
                    Reservations.add(new Reservation(Date, Time, customerId, tableId));
                    factory.Handler.WriteReservation(Reservations);

                }

            }
        }
        if(flag){
            return 0;
        }
        else return tableId;
    }
    public boolean cancelReservation(int TableId, ArrayList<Table> AllTables, Factory factory){
        for (Table Tables: AllTables){
            if (Tables.getTableId() == TableId){
                if(removeFromStorage(TableId, factory)) {
                    Tables.setReserved(false);
                    return true;
                }
            }
        }
        return false;
    }

     boolean removeFromStorage(int tableId , Factory factory){
        for (int i = 0; i<Reservations.size(); i++){
            if (Reservations.get(i).table.getTableId() == tableId) {
                Reservations.remove(i);
                factory.Handler.WriteReservation(Reservations);
                return true;
            }
        }
        return false;
    }
}
