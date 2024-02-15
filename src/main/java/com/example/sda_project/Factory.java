package com.example.sda_project;

public class Factory {
    PersistenceHandler Handler  = new FileHandler();

    public int generateRandomId( int ArrayOfIds[]) {
        int randomId = 0;
        boolean flag = false;
        do {
            flag = true;
            for (int i = 0; i < ArrayOfIds.length; i++) {
                if (randomId == ArrayOfIds[i]) {
                    randomId++;
                    flag = false;
                }
            }
        } while (!flag);
        return randomId;
    }

}
