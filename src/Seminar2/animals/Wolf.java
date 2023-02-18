package Seminar2.animals;

public class Wolf extends Animal {

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public Wolf() {}

    public Wolf(int age, int weight, int numberOfLimbs) {
        super(age, weight, numberOfLimbs);
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
