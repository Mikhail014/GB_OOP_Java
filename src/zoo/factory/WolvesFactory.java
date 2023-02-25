package zoo.factory;

import zoo.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolvesFactory {

    public static ArrayList<Wolf> createCollectionWolves(int countWolves) {
        if (countWolves >= 0){
            ArrayList<Wolf> wolves = new ArrayList<>(countWolves);
            for (int i = 0; i < countWolves; i++) {
                int age = new Random().nextInt(10, 20);
                int weight = new Random().nextInt(70, 95);
                int numOfLimps = 4;
                Wolf wolf = new Wolf(age, weight, numOfLimps);
                wolves.add(wolf);
            }
            return wolves;
        }
        return null;
    }
}