package seminarProject.terminal;

import seminarProject.animals.Lion;
import seminarProject.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Lion lion) {
        this.zoo = zoo;
        this.lion = lion;
    }

    @Override
    public void execute() {
        zoo.addLion(lion);
    }
}
