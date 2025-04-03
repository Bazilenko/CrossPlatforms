package Scan;

import Creator.Creator;
import Formatter.GameType;
import Matches.MatchesManager;
import Printer.MatchesPrinter;
import Printer.MenuPrinter;
import Filter.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuScan {
    Scanner scanner = new Scanner(System.in);

    public void menuScan(){
        MenuPrinter menuPrinter = new MenuPrinter();
        MatchesManager manager = new MatchesManager();
        MatchesPrinter matchesPrinter = new MatchesPrinter(manager);
        String command;
        String type;
        GameType gameType;


        do {
            menuPrinter.printDescription();
            command = scanner.nextLine();
            switch (command) {
                case "1" -> {
                    menuPrinter.printDescription1();
                }
                case "2" -> {
                    menuPrinter.printDescription2();
                    type = scanner.nextLine();
                    gameType = GameType.valueOf(type.toUpperCase());
                    matchesPrinter.printByType(gameType);

                }

                case "3" -> {
                    menuPrinter.printDescription3();
                    type = scanner.nextLine();
                    gameType = GameType.valueOf(type.toUpperCase());
                    Filter filter = new Filter();
                    LocalDate startDate, endDate;
                    System.out.println("Enter start date for filter: ");
                    startDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    System.out.println("Enter start date for filter: ");
                    endDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    filter.filterByDate(manager.getByType(gameType), startDate, endDate);

                }
                case "4" -> {
                    menuPrinter.printDescription4();
                    type = scanner.nextLine();
                    gameType = GameType.valueOf(type.toUpperCase());
                    manager.addMatch(Creator.createMatch(gameType));

                }

                case "exit" -> {
                    System.out.println("Exiting from program...");
                    return;
                }
                default -> {
                    System.out.println("Unknown command");
                }
            }
        } while (!command.equals("exit"));
    }
}
