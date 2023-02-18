package Seminar2.animals;

public abstract class Animal {
    protected int age;
    protected int weight;
    protected int numberOfLimbs;


    public Animal() {}

    public Animal(int age, int weight, int numberOfLimbs) {
        this.age = age;
        this.weight = weight;
        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract int getMaxWeight();

    public void feed(int foodWeight){
        if (weight + foodWeight <= getMaxWeight()){
            weight += foodWeight;
        }
        else {
            System.out.println("");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract String getType();
}
