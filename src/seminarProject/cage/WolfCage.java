package seminarProject.cage;

import seminarProject.animals.Animal;
import seminarProject.animals.Wolf;
import seminarProject.comporator.WolfComparator;
import seminarProject.iterator.WolfIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf>{

    private ArrayList<Wolf> wolves;
    private int pollutionVolume;

    public WolfCage() {
        wolves = new ArrayList<>();
    }

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public void addAnimalInCage(Wolf animal) {
        wolves.add(animal);
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
    public Wolf getFirstAnimalFromCage() {
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
