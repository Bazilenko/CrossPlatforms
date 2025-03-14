package Scan;

import Printer.MenuPrinter;

import java.util.Scanner;

public class MenuScan {
    Scanner scanner;

    public void menuScan(){
        String command = scanner.nextLine();
        switch (command){
            case "1" ->{
                MenuPrinter menuPrinter = new MenuPrinter();
                menuPrinter.printDescription1();
            }
            case "2" -> {

            }

            case "exit" ->{
                System.out.println("Exiting from program...");
                return;
            }
        }
    }
}
