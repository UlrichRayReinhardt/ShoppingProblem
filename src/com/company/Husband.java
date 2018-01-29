package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Husband implements Visitor {

    private static Husband husband = null;
    private static ShoppingCart cart;
    private static HashMap<String, Integer> allAvailableGoods;

    private Husband() {
    }

    public static Husband getHusband() {
        if (husband == null) {
            husband = new Husband();
            allAvailableGoods = new HashMap<>();
            cart = new ShoppingCart();
        }
        return husband;
    }

    public HashMap<String, Integer> getAllPrices() {
        return allAvailableGoods;
    }


    public HashMap<String, Integer> getBought() {
                return cart.getAllBought();
    }

    public void retrieveAllAvailable(ShopStreet shopStreet) {
        for (Shop shop : shopStreet.shops()){
            allAvailableGoods.putAll(shop.getTovars());
        cart.goShopping(shop);
    }}

    @Override
    public void visit(Visitable visitable) {
    }

    public void getOrder(ArrayList<String> order) {
        cart.setOrder(order);
    }
}
