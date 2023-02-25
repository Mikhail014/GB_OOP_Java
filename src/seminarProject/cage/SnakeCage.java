package seminarProject.cage;

import seminarProject.animals.Animal;
import seminarProject.animals.Snake;
import seminarProject.animals.Wolf;

import java.util.ArrayList;
import java.util.List;

public class SnakeCage implements AnimalCage<Snake>{

    private ArrayList<Snake> snakes;
    private int pollutionVolume;

    public SnakeCage() {}

    public SnakeCage(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public void addAnimalInCage(Snake animal) {
        snakes.add(animal);
    }

    @Override
    public void addFood(int foodWeight) {
        for (Animal animal: snakes){
            animal.feed(foodWeight / snakes.size());
        }
    }

    @Override
    public void clearCage() {
        pollutionVolume = 0;
    }

    @Override
    public Snake getFirstAnimalFromCage() {
        if (!snakes.isEmpty()){
            return snakes.get(0);
        }
        return null;
    }

}
