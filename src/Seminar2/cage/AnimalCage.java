package Seminar2.cage;

import Seminar2.animals.Animal;

public interface AnimalCage {

    void addAnimalInCage(Animal animal);

    void feedTransferInCage(int countFeed);

    void clearCage();
    Animal getFirstAnimalFromCage();

}
