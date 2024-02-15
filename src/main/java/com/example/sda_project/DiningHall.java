package com.example.sda_project;

import java.util.ArrayList;

public class DiningHall {
    ArrayList<Table> tables = new ArrayList<>();
    public void LoadTableData(Factory factory){
        factory.Handler.ReadTable(tables);
    }

    public ArrayList<Table> showAvailableTables(){
        ArrayList<Table> TempArr = new ArrayList<>();
        for (Table table : tables ){
            if (!table.getIsReserved()) {
                TempArr.add(table);
            }
        }
        return TempArr;
    }
}
