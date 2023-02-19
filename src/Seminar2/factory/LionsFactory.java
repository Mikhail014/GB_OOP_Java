package Seminar2.factory;

import Seminar2.animals.Lion;

import java.util.ArrayList;

public class LionsFactory {

    public static ArrayList<Lion> createCollectionLions(int countLions) {
        if (countLions >= 0){
            ArrayList<Lion> lions = new ArrayList<>(countLions);
            for (int i = 0; i < countLions; i++) {
                Lion lion = new Lion();
                lions.add(lion);
            }
            return lions;
        }
        return null;
    }

}
