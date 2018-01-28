package com.company;

public class VegetablesShop extends Shop {

    VegetablesShop(){
        addTovar("Bread", 110);
        addTovar("Sausage", 80);
        addTovar("Butter", 70);
        addTovar("Milk", 300);
        addTovar("Potato", 40);
    }

    @Override
    public void sell() {

    }
}
