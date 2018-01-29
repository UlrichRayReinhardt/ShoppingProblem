package com.company;

import java.util.ArrayList;
import java.util.Map;

public class Wife {

    private ArrayList<String> order;
    Husband husband;

    Wife() {
        order = new ArrayList<>();
        husband = Husband.getHusband();
    }


    private void generateOrder() {
        order.add("Sony");
        order.add("Bread");
        order.add("Lenovo");
        order.add("Onion");
        order.add("Gold Ring");
        }


    public void giveOrder() {
        generateOrder();
        husband.getOrder(order);
    }


    public void printResult() {
        System.out.println("Total list: ");
        for (Map.Entry<String, Integer> entry : husband.getAllPrices().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nBought: ");
        for (Map.Entry<String, Integer> entry : husband.getBought().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
