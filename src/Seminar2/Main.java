package Seminar2;

import Seminar2.animals.Lion;
import Seminar2.cage.LionCage;
import Seminar2.factory.LionsFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createCollectionLions(6);
        System.out.println(lions);
        LionCage lionCage = new LionCage(lions, 0);
        lionCage.addFood(30);
        System.out.println(lions);
    }

}
