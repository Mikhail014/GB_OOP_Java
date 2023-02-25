package zoo.cage;

import zoo.animals.Animal;

public interface AnimalCage {

    void addAnimalInCage(Animal animal);
    void addFood(int foodWeight);
    void clearCage();
    Animal getFirstAnimalFromCage();

}
