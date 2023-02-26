package seminarProject.cage;

import seminarProject.animals.Animal;
import seminarProject.animals.Lion;
import seminarProject.comporator.LionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LionCage implements AnimalCage<Lion>{

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
    public void addAnimalInCage(Lion animal) {
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
    public Lion getFirstAnimalFromCage() {
        if (!lions.isEmpty()){
            return lions.get(0);
        }
        return null;
    }

    @Override
    public void deleteAnimalFromCage() {
        if (!lions.isEmpty()){
            lions.remove(0);
        }
    }


    @Override
    public String toString() {
        return "Клетка со львами: {" + lions + '}';
    }

    public void sortManeVolume() {
        Collections.sort(lions, new LionComparator());
    }

}
