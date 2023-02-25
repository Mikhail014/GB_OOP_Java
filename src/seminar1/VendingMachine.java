package seminar1;

import java.util.ArrayList;

public class VendingMachine<T extends Product> {
    protected ArrayList<T> products;

    public VendingMachine(){}

    public VendingMachine(ArrayList<T> products){
        this.products = products;
    }

    public ArrayList<T> getProducts() {
        return products;
    }

    public T getProduct(String name){
        for (T el: products){
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }
}
