package seminarProject;

import seminarProject.terminal.SpaceParser;
import seminarProject.terminal.TerminalReader;

public class Main {

    public static void main(String[] args) {
        TerminalReader terminalReader = TerminalReader.newTerminalReader(new SpaceParser());
        terminalReader.endless();
    }

}
