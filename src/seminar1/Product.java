package seminar1;

public class Product {
    protected String name;
    protected float price;

    public Product(){}

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void consume(){
        System.out.println(name + " - продукт потреблен");
    }

    @Override
    public String toString() {
        return name + ", " + price + " руб.";
    }
}
