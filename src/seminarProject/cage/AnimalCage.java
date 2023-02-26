package seminarProject.cage;

import seminarProject.animals.Animal;

import java.util.List;

public interface AnimalCage<T extends Animal> {

    void addAnimalInCage(T animal);
    void addFood(int foodWeight);
    void clearCage();
    T getFirstAnimalFromCage();
    void deleteAnimalFromCage();

}
