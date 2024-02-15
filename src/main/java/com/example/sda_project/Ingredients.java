package com.example.sda_project;

public class Ingredients {
    private int IngredientId;
    private int Quantity;

    public int getIngredientId() {
        return IngredientId;
    }

    public int getQuantity() {
        return Quantity;
    }


    public Ingredients() {
        IngredientId = -1;
        Quantity = -1;
    }

    public Ingredients(int ingredientId, int quantity) {
        IngredientId = ingredientId;
        Quantity = quantity;
    }
}
