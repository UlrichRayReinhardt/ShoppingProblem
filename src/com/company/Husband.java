package com.company;

import java.util.List;

public class Husband {
    private static Husband husband = null;

    protected Husband() {}

    public static Husband getHusband() {
        if (husband == null) {
            husband = new Husband();
        }
        return husband;
    }

/*    private Set<Shop> knownShops;*/

 /*   Husband() {
        knownShops = new HashSet<>();
        knownShops.add(new JewerlyShop());
        knownShops.add(new TechnicsShop());
        knownShops.add(new VegetablesShop());
    }*/

    public void getOrder(List<String> list) {
        goShopping();
    }

    private void goShopping() {
       /* for ()*/
    }

    public void getGoods() {

    }


    public void giveResult(Wife wife) {
        wife.printResult();

    }
}
