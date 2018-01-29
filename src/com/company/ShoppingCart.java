package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private ArrayList<String> order = new ArrayList<>();
    private HashMap<String, Integer> bought = new HashMap<>();
    Husband husband = Husband.getHusband();

    public void goShopping(Shop shop) {
        for (Map.Entry<String, Integer> m : shop.getTovars().entrySet()) {
            if (order.contains(m.getKey()))
                addToCart(m.getKey(), m.getValue());
        }
    }

    public void addToCart(String s, int i) {
        bought.put(s, i);
    }

    public void setOrder(ArrayList<String> order) {
        this.order = order;
    }

    public HashMap<String, Integer> getAllBought() {
        return bought;
    }
}