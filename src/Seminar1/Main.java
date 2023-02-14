package Seminar1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Шоколад", 89);
        Product p2 = new Product("Печенье", 59);
        Drink p3 = new Drink("Черноголовка", 119, 2);
        Drink p4 = new Drink("Ананасовый сок", 139, 1);
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        for (Product el: products){
            el.consume();
        }


    }
}