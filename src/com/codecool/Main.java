package com.codecool;

import com.codecool.order.OrderItem;
import com.codecool.order.drink.Drink;
import com.codecool.order.drink.DrinkType;
import com.codecool.order.food.Ingredient;
import com.codecool.order.food.Sandwich;
import com.codecool.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurantAstoria = new Restaurant();

        List<Ingredient> sandwich1Ingredients = new ArrayList<>();
        sandwich1Ingredients.add(new Ingredient("White Bread", 99));
        sandwich1Ingredients.add(new Ingredient("Bacon", 399));
        sandwich1Ingredients.add(new Ingredient("Cheese", 199));

        OrderItem sandwich1 = new Sandwich(sandwich1Ingredients);
        restaurantAstoria.addNewOrder(sandwich1);

        List<Ingredient> sandwich2Ingredients = new ArrayList<>();
        sandwich2Ingredients.add(new Ingredient("Whole Wheat Bread", 219));
        sandwich2Ingredients.add(new Ingredient("Lettuce", 29));
        sandwich2Ingredients.add(new Ingredient("Cheese", 199));
        sandwich2Ingredients.add(new Ingredient("Tomato", 169));

        OrderItem sandwich2 = new Sandwich(sandwich2Ingredients);
        restaurantAstoria.addNewOrder(sandwich2);

        OrderItem coke = new Drink(DrinkType.COKE);
        restaurantAstoria.addNewOrder(coke);

        int income = restaurantAstoria.calculatePriceOfAllOrders();
        System.out.println("Income of the restaurant: " + income);

        System.out.println(restaurantAstoria);
    }

}
