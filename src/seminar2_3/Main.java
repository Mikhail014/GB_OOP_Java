package seminar2_3;

import seminar2_3.animals.Lion;
import seminar2_3.animals.Wolf;
import seminar2_3.cage.LionCage;
import seminar2_3.cage.WolfCage;
import seminar2_3.comporator.WolfComparator;
import seminar2_3.factory.LionsFactory;
import seminar2_3.factory.WolvesFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wolf> wolves = WolvesFactory.createCollectionWolves(5);
        WolfCage wolfCage = new WolfCage(wolves);
        wolfCage.sortWolves();
        for (Wolf wolf: wolfCage) {
            System.out.println(wolf);
        }
    }

}
