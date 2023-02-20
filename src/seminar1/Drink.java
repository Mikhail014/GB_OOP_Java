package seminar1;

public class Drink extends Product {

    protected int volumeDrink;

    public Drink() {}

    public Drink(String name, float price, int volumeDrink) {
        super(name, price);
        this.volumeDrink = volumeDrink;
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

    @Override
    public String toString() {
        return name + ", " + price + " руб.";
    }
}
