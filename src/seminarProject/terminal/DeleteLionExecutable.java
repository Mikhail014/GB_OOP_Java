package seminarProject.terminal;

import seminarProject.animals.Lion;
import seminarProject.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.deleteLion();
    }
}
