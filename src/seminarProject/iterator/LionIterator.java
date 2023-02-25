package seminarProject.iterator;

import seminarProject.animals.Lion;

import java.util.ArrayList;
import java.util.Iterator;

public class LionIterator implements Iterator<Lion> {

    private ArrayList<Lion> lions;
    private int cursor;

    public LionIterator(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public boolean hasNext() {
        return cursor < lions.size();
    }

    @Override
    public Lion next() {
        return lions.get(cursor++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
