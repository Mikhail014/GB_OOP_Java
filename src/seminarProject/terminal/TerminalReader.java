package seminarProject.terminal;

import seminarProject.zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;
    private Zoo zoo;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
        zoo = new Zoo();
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory(zoo);
        while (true) {
            System.out.println(zoo);
            System.out.println("Введите код операции, возраст, вес, кол-во конечностей и объем гривы.");
            System.out.println("Коды операций: 1 - добавить животное, 2 (или любой символ) - удалить.");
            System.out.println("Нажатие на Enter без ввода приведет к выходу из программы.");
            System.out.println("Ввод чисел осуществляется через пробел.");
            System.out.println("Пример ввода: 1 10 85 4 20");
            System.out.print("Ответ: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("------------------------------");
                System.out.println("Вы вышли из программы! Удачи!");
                System.out.println("------------------------------");
                break;
            }
            String[] parseInput = commandParser.parseCommand(input);
            if (parseInput.length != 5 && parseInput[0].equals("1")) {
                System.out.println("------------------------------");
                System.out.println("Ошибка! Должно быть введено 5 чисел через пробел!");
                System.out.println("------------------------------");
                continue;
            }
            CommandExecutable commandExecutable = commandExecutableFactory.create(parseInput);
            commandExecutable.execute();
        }
        scanner.close();
    }

}
