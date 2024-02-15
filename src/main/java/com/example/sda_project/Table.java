package com.example.sda_project;

public class Table {
    private int TableId;
    private boolean IsReserved;
    private int NoOfChair;

    public Table(int tableId, boolean isReserved, int noOfChair) {
        TableId = tableId;
        IsReserved = isReserved;
        NoOfChair = noOfChair;
    }

    public void setTableId(int tableId) {
        TableId = tableId;
    }

    public Table() {
        TableId = -1;
        IsReserved = false;
        NoOfChair = -1;
    }

    public int getTableId() {
        return TableId;
    }

    public boolean getIsReserved() {
        return IsReserved;
    }

    public void setReserved(boolean reserved) {
        IsReserved = reserved;
    }

    public int getNoOfChair() {
        return NoOfChair;
    }

}
