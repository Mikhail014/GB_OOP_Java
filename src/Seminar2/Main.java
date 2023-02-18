package Seminar2;

import Seminar2.animals.Lion;
import Seminar2.cage.LionCage;
import Seminar2.factory.LionsFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createCollectionLions(5);
        lions.add(new Lion(15, 88, 4, 20));
        lions.add(new Lion(17, 94, 4, 22));
        lions.add(new Lion(16, 79, 4, 18));
        lions.add(new Lion(20, 81, 4, 19));
        lions.add(new Lion(12, 95, 4, 21));
        System.out.println(lions);
        LionCage lionCage = new LionCage(lions, 0);
        lionCage.feedTransferInCage(30);
        System.out.println(lions);
    }

}
