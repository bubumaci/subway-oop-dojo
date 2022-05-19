package com.codecool.restaurant;

import com.codecool.order.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<OrderItem> ordersList;

    public Restaurant() {
        ordersList = new ArrayList<>();
    }

    public void addNewOrder(OrderItem orderItem) {
        ordersList.add(orderItem);
    }

    public int calculatePriceOfAllOrders() {
        int sum = 0;
        for (OrderItem orderItem : ordersList) {
            sum += orderItem.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ordersList=" + ordersList +
                '}';
    }
}
