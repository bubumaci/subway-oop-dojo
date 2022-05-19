package com.codecool.order.drink;

import com.codecool.order.OrderItem;

public class Drink implements OrderItem {
    private final DrinkType drinkType;

    public Drink(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public String getFlavour() {
        return drinkType.name();
    }

    @Override
    public int getPrice() {
        return drinkType.getPrice();
    }

    @Override
    public String toString() {
        return "Drink{\n" +
                "drinkType=" + drinkType +
                '}';
    }
}
