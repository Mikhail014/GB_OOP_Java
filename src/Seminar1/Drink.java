package Seminar1;

public class Drink extends Product {

    private int volumeDrink;

    public Drink() {}

    public Drink(String name, float price, int volumeDrink) {
        super(name, price);
    }

    public int getVolumeDrink() {
        return volumeDrink;
    }

    public void setVolumeDrink(int volumeDrink) {
        this.volumeDrink = volumeDrink;
    }

    public void consume(){
        System.out.println(name + " - напиток выпит");
    }
}
