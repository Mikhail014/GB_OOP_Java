package seminarProject.terminal;

import seminarProject.animals.Lion;
import seminarProject.zoo.Zoo;

public class CommandExecutableFactory {

    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String[] input){
        System.out.println();
        if (input[0].equals("1")) {
            Lion lion = new Lion(Integer.parseInt(input[1]),
                    Integer.parseInt(input[2]),
                    Integer.parseInt(input[3]),
                    Integer.parseInt(input[4]));
            return new CreateLionExecutable(zoo, lion);
        }
        return new DeleteLionExecutable(zoo);
    }

}
