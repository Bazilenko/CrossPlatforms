package Printer;

import Formatter.GameType;

public class MenuPrinter extends Printer {
    private final String DESCRIPTION_MAIN = """
                    Welcome to main menu!!!
                    Choose option:
                    1.Show games list.
                    2.Show full match history.
                    3.Search match history by filter.
                    4.Add match.
                    5.Delete match.
                    6.Sort by parameter match history.
                    Enter main to get back to main menu!!!
                    Enter exit to stop the program!!!
                    """;
    private final String GAME_DESCRIPTION =
            String.valueOf(GameType.CS) + " " +
            String.valueOf(GameType.DOTA2) + " " +
            String.valueOf(GameType.FIFA) + " " +
            String.valueOf(GameType.NFS);

    private final String DESCRIPTION2 = "Enter name of game to show matches: ";

    private final String DESCRIPTION3 = "Choose game for filter: ";

    private final String DESCRIPTION4 = "Enter name of game to add match: ";


    public void printDescription (){
        printLine(DESCRIPTION_MAIN);
    }

    public void printDescription1 (){
        printLine(GAME_DESCRIPTION);
    }

    public void printDescription2(){
        printLine(DESCRIPTION2);

    }

    public void printDescription4(){
        printLine(DESCRIPTION4);

    }

    public void printDescription3(){
        printLine(DESCRIPTION3);
    }




}
