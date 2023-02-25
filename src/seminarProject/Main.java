package seminarProject;

import seminarProject.animals.Wolf;
import seminarProject.cage.WolfCage;
import seminarProject.factory.WolvesFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wolf> wolves = WolvesFactory.createCollectionWolves(5);
        WolfCage wolfCage = new WolfCage(wolves);
        wolfCage.sortWolves();
        for (Wolf wolf: wolfCage) {
            System.out.println(wolf);
        }
    }

}
