package com.example.sda_project;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Ingredients> allIngredients  = new ArrayList<>();
    public void loadIngredientData(Factory factory){
        factory.Handler.ReadIngredient(allIngredients);
    }

    public boolean reStockIngredients(int id,int Quantity , Factory factory){
        if(allIngredients.add(new Ingredients(id, Quantity))) {
            factory.Handler.WriteIngredient(new Ingredients(id, Quantity));
            return true;
        }
            return false;
    }


}
