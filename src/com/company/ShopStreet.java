package com.company;

import java.util.ArrayList;

public class ShopStreet{

    private JewerlyShop jewerlyShop;
    private VegetablesShop vegetablesShop;
    private TechnicsShop technicsShop;

    ShopStreet() {
        jewerlyShop = new JewerlyShop();
        vegetablesShop = new VegetablesShop();
        technicsShop = new TechnicsShop();
    }

    public ArrayList<Shop> shops() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(jewerlyShop);
        shops.add(vegetablesShop);
        shops.add(technicsShop);
        return shops;
    }

}
