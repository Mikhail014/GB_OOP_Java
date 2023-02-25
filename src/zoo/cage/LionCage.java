package zoo.cage;

import zoo.animals.Animal;
import zoo.animals.Lion;
import zoo.comporator.LionComparator;

import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage{

    private ArrayList<Lion> lions;
    private int pollutionVolume;

    public LionCage() {
        lions = new ArrayList<>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public LionCage(ArrayList<Lion> lions, int pollutionVolume) {
        this.lions = lions;
        this.pollutionVolume = pollutionVolume;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    @Override
    public void addAnimalInCage(Animal animal) {
        if (animal instanceof Lion){
            lions.add((Lion) animal);
        }
    }

    @Override
    public void addFood(int foodWeight) {
        for (Animal animal: lions){
            animal.feed(foodWeight / lions.size());
        }
    }

    @Override
    public void clearCage() {
        pollutionVolume = 0;
    }

    @Override
    public Animal getFirstAnimalFromCage() {
        if (!lions.isEmpty()){
            return lions.get(0);
        }
        return null;
    }

    public void sortManeVolume() {
        Collections.sort(lions, new LionComparator());
    }

}
