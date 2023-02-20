package seminar2_3.cage;

import seminar2_3.animals.Animal;

public interface AnimalCage {

    void addAnimalInCage(Animal animal);
    void addFood(int foodWeight);
    void clearCage();
    Animal getFirstAnimalFromCage();

}
