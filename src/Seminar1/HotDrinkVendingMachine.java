package Seminar1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine() {}

    public HotDrinkVendingMachine(ArrayList<Product> products) {
        super(products);
    }

    public HotDrink GetProduct(String name, int volume, int temp){
        for (Product el: products){
            if (el instanceof HotDrink){
                HotDrink hd = (HotDrink) el;
                if (hd.getName().equals(name) && volume == hd.getVolumeDrink()
                        && temp == ((HotDrink) el).getTemp()){
                    return hd;
                }
            }
        }
        return null;
    }
}
