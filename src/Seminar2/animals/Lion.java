package Seminar2.animals;

public class Lion extends Animal{
    private int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";


    public Lion() {}

    public Lion(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    public Lion(int age, int weight, int numberOfLimbs, int maneVolume) {
        super(age, weight, numberOfLimbs);
        this.maneVolume = maneVolume;
    }



    public float getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return "Возраст: " + age + "\n" +
                "Вес: " + weight + "\n" +
                "Количество конечностей: " + numberOfLimbs + "\n" +
                "Объем гривы: " + maneVolume;
    }
}
