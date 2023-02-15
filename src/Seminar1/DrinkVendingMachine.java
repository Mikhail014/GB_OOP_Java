package Seminar1;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine{

    private ArrayList<Drink> drinkList;

    public DrinkVendingMachine() {}

    public DrinkVendingMachine(ArrayList<Product> products, ArrayList<Drink> drinks) {
        super(products);
        this.drinkList = drinks;
    }

    public DrinkVendingMachine(ArrayList<Drink> drinks) {
        this.drinkList = drinks;
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }

    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    public Product GetProduct(String name){
        for (Drink el: drinkList){
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }

}