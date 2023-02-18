package Seminar2.factory;

import Seminar2.animals.Lion;

import java.util.ArrayList;

public class LionsFactory {

    public static ArrayList<Lion> createCollectionLions(int countLions) {
        return new ArrayList(countLions);
    }

}
