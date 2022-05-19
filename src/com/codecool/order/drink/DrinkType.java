package com.codecool.order.drink;

public enum DrinkType {
    COKE(400), FANTA(380), ICE_TEA(520);

    private int price;

    DrinkType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "DrinkType{" +
                "price=" + price +
                "} " + super.toString();
    }
}
