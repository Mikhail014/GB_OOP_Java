package zoo.factory;

import zoo.animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {

    public static ArrayList<Lion> createCollectionLions(int countLions) {
        if (countLions >= 0){
            ArrayList<Lion> lions = new ArrayList<>(countLions);
            for (int i = 0; i < countLions; i++) {
                int age = new Random().nextInt(10, 20);
                int weight = new Random().nextInt(70, 95);
                int numOfLimps = 4;
                int maneVolume = new Random().nextInt(10, 20);
                Lion lion = new Lion(age, weight, numOfLimps, maneVolume);
                lions.add(lion);
            }
            return lions;
        }
        return null;
    }

}
