package Seminar2.cage;

import Seminar2.animals.Animal;
import Seminar2.animals.Lion;
import Seminar2.animals.Wolf;

import java.util.ArrayList;

public class WolfCage implements AnimalCage{

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
}
