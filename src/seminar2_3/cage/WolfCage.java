package seminar2_3.cage;

import seminar2_3.animals.Animal;
import seminar2_3.animals.Wolf;
import seminar2_3.comporator.WolfComparator;
import seminar2_3.iterator.WolfIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WolfCage implements AnimalCage, Iterable<Wolf>{

    private ArrayList<Wolf> wolves;
    private int pollutionVolume;

    public WolfCage() {
        wolves = new ArrayList<>();
    }

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public void addAnimalInCage(Animal animal) {
        if (animal instanceof Wolf){
            wolves.add((Wolf) animal);
        }
    }

    @Override
    public void addFood(int foodWeight) {
        for (Animal animal: wolves){
            animal.feed(foodWeight / wolves.size());
        }
    }

    @Override
    public void clearCage() {
        pollutionVolume = 0;
    }

    @Override
    public Animal getFirstAnimalFromCage() {
        if (!wolves.isEmpty()){
            return wolves.get(0);
        }
        return null;
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

    public void sortWolves() {
        Collections.sort(wolves, new WolfComparator());
    }
}
