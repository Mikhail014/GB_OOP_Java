package Seminar2.cage;

import Seminar2.animals.Animal;
import Seminar2.animals.Lion;

import java.util.ArrayList;

public class LionCage implements AnimalCage{

    private ArrayList<Lion> lions;
    private int pollutionVolume;

    public LionCage() {
        lions = new ArrayList<>();
    }

    public LionCage(ArrayList<Lion> lions, int pollutionVolume) {
        this.lions = lions;
        this.pollutionVolume = pollutionVolume;
    }

    @Override
    public void addAnimalInCage(Animal animal) {
        if (animal instanceof Lion){
            lions.add((Lion) animal);
        }
    }

    @Override
    public void feedTransferInCage(int countFeed) {
        for (Animal animal: lions){
            animal.feed(countFeed / lions.size());
        }
    }

    @Override
    public void clearCage() {
        pollutionVolume = 0;
    }

    @Override
    public Animal getFirstAnimalFromCage() {
        return lions.get(0);
    }

}
