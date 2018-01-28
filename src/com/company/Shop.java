package com.company;

import javafx.util.Pair;

import java.util.Set;

public abstract class Shop {

    Set<Pair<String, Integer>> tovars;

    protected void addTovar(String s, Integer price) {
        tovars.add(new Pair<>(s, price));
    }

    public abstract void sell();
}
