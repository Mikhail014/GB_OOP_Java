package Seminar1;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> products;

    public VendingMachine(){}

    public VendingMachine(ArrayList<Product> products){
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Product> GetProductsByName(String name){
        ArrayList<Product> productsByName = new ArrayList<>();
        for (Product el: products){
            if (el.getName().equals(name)){
                productsByName.add(el);
            }
        }
        return productsByName;
    }
}
