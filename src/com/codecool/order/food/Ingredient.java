package com.codecool.order.food;

public class Ingredient {
    private final String name;
    private final int price;

    public Ingredient(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ingredient{\n" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
