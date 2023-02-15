package Seminar1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Шоколад", 99);
        Product p2 = new Product("Вафли", 79);
        Drink d1 = new Drink("Апельсиновый сок", 139, 2000);
        Drink d2 = new Drink("Гранатовый сок", 159, 1500);
        HotDrink hd1 = new HotDrink("Капучино", 350, 250, 92);
        HotDrink hd2 = new HotDrink("Эспрессо", 300, 250, 94);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(d1);
        productList.add(d2);
        productList.add(hd1);
        productList.add(hd2);
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine(productList);
        HotDrink hotDrink = hdvm.GetProduct("Эспрессо", 250, 94);
        System.out.println("Найден товар: " + hotDrink);
    }
}