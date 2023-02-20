package seminar2_3.animals;

public class Lion extends Animal implements Comparable<Lion> {
    private int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";


    public Lion() {
    }

    public Lion(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    public Lion(int age, int weight, int numberOfLimbs, int maneVolume) {
        super(age, weight, numberOfLimbs);
        this.maneVolume = maneVolume;
    }


    public int getManeVolume() {
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
        return "Lion{" +
                "maneVolume=" + maneVolume +
                ", age=" + age +
                ", weight=" + weight +
                ", numberOfLimbs=" + numberOfLimbs +
                '}';
    }

    @Override
    public int compareTo(Lion o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}