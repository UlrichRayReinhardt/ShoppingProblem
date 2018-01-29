package com.company;

public class Main {
    public static void main(String[] args) {
        Husband husband = Husband.getHusband();
        Wife wife = new Wife();
        wife.giveOrder();

        ShopStreet street = new ShopStreet();
        husband.retrieveAllAvailable(street);
        wife.printResult();
    }
}
