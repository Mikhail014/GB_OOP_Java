package lessons.lesson3;

import java.util.Iterator;

public class Worker implements Iterator<String>, Comparable<Worker> {

    private String name;
    private int age;
    private int index;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public String next() {
        if (index == 1) {
            return "Name: " + name;
        }
        return "Age: " + age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return Integer.compare(this.age, o.age);
    }
}
