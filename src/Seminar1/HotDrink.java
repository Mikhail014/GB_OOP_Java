package Seminar1;

public class HotDrink extends Drink {

    private int temp;

    public HotDrink(int temp) {
        this.temp = temp;
    }

    public HotDrink(String name, float price, int volumeDrink, int temp) {
        super(name, price, volumeDrink);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
