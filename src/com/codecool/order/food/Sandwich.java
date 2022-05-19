package com.codecool.order.food;

import com.codecool.order.OrderItem;

import java.util.List;

public class Sandwich implements OrderItem {

    private final List<Ingredient> ingredientList;

    public Sandwich(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Ingredient ingredient : ingredientList) {
            sum += ingredient.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "ingredientList=" + ingredientList +
                '}';
    }
}
