package seminarProject.terminal;

public class SpaceParser implements CommandParser {
    @Override
    public String[] parseCommand(String inputCommand) {
        return inputCommand.split(" ");
    }
}
