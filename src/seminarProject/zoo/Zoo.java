package seminarProject.zoo;

import seminarProject.animals.Lion;
import seminarProject.animals.Snake;
import seminarProject.animals.Wolf;
import seminarProject.cage.AnimalCage;
import seminarProject.cage.LionCage;
import seminarProject.cage.SnakeCage;
import seminarProject.cage.WolfCage;


import java.util.List;

public class Zoo {

    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo() {
        wolfCage = new WolfCage();
        lionCage = new LionCage();
        snakeCage = new SnakeCage();
    }

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeCage;
    }
}
