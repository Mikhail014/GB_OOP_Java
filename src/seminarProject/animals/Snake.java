package seminarProject.animals;

public class Snake extends Animal{
    private int bodyLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";

    public Snake() {}

    public Snake(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public Snake(int age, int weight, int numberOfLimbs, int bodyLength) {
        super(age, weight, numberOfLimbs);
        this.bodyLength = bodyLength;
    }

    public float getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String getType() {
        return "Змея";
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }
}
