package seminar1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine<HotDrink> {

    public HotDrinkVendingMachine() {}

    public HotDrinkVendingMachine(ArrayList<HotDrink> products) {
        super(products);
    }

    public HotDrink getProduct(String name, int volume, int temp){
        for (HotDrink el: products){
            if (el.getName().equals(name) && volume == el.getVolumeDrink()
                    && temp == el.getTemp()){
                return el;
            }

        }
        return null;
    }
}
