package Seminar2.cage;

import Seminar2.animals.Animal;

public interface AnimalCage {

    void addAnimalInCage(Animal animal);
    void addFood(int foodWeight);
    void clearCage();
    Animal getFirstAnimalFromCage();

}
