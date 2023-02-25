package zoo.comporator;

import zoo.animals.Lion;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        return Integer.compare(o1.getManeVolume(), o2.getManeVolume());
    }
}
