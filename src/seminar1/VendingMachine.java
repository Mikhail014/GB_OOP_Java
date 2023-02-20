package seminar1;

import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> products;

    public VendingMachine(){}

    public VendingMachine(ArrayList<Product> products){
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product GetProduct(String name){
        for (Product el: products){
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }
}
