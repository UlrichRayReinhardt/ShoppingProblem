package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {

        Wife wife = new Wife();
        Husband husband = new Husband();


        List<String> order = wife.generateOrder();
        husband.getOrder(order);

        husband.giveResult(wife);

        wife.printResult();

        List<Shop> shops = new ArrayList<>();
        shops.add(new VegetablesShop());
        shops.add(new TechnicsShop());
        shops.add(new JewerlyShop());
        husband.getGoods();

    }
}



