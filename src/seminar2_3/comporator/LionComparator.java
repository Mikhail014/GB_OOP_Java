package seminar2_3.comporator;

import seminar2_3.animals.Lion;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        return Integer.compare(o1.getManeVolume(), o2.getManeVolume());
    }
}
