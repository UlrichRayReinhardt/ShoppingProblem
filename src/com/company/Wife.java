package com.company;

import java.util.ArrayList;
import java.util.List;

public class Wife {

    List<String> order;



    Wife() {
        order = new ArrayList<>();
        Husband husband = Husband.getHusband();
    }

    public List<String> generateOrder() {
        order.add("Sony");
        order.add("Bread");
        order.add("Lenovo");
        order.add("Onion");
        order.add("Gold Ring");
        return order;
    }

    public void printResult() {
        System.out.println("Total list: ");

    }
}
