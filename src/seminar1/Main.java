package seminar1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Шоколад", 99);
        Product p2 = new Product("Вафли", 79);
        Drink d1 = new Drink("Апельсиновый сок", 139, 2000);
        Drink d2 = new Drink("Гранатовый сок", 159, 1500);
        HotDrink hd1 = new HotDrink("Капучино", 350, 250, 92);
        HotDrink hd2 = new HotDrink("Эспрессо", 300, 250, 94);

        ArrayList<HotDrink> productList = new ArrayList<>();
        productList.add(hd1);
        productList.add(hd2);
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine(productList);
        HotDrink hotDrink = hdvm.getProduct("Эспрессо", 250, 94);
        System.out.println("Найден товар: " + hotDrink);
    }
}