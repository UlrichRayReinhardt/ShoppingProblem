package com.company;

import java.util.HashMap;

public abstract class Shop implements Visitable{

    private HashMap<String, Integer> tovars = new HashMap<>();

    public void addTovar(String s, Integer price) {
        tovars.put(s, price);
    }

    public HashMap<String,Integer> getTovars() {
        return tovars;
    }
}
