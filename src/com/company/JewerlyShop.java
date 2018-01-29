package com.company;

public class JewerlyShop extends Shop {


    JewerlyShop(){
        addTovar("Gold Ring", 300);
        addTovar("NeckLake", 200);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
