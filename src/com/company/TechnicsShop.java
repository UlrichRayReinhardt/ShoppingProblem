package com.company;

public class TechnicsShop extends Shop{

    TechnicsShop(){
        addTovar("Sony", 100);
        addTovar("Samsung", 80);
        addTovar("Sharp", 70);
        addTovar("Apple", 300);
        addTovar("Aser", 40);
    }

    @Override
    public void sell() {

    }
}
