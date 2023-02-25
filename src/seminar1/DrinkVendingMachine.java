package seminar1;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine<Drink>{

    public DrinkVendingMachine() {}

    public DrinkVendingMachine(ArrayList<Drink> products) {
        super(products);
    }

    public Drink getProduct(String name){
        for (Drink el: products){
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }

}
