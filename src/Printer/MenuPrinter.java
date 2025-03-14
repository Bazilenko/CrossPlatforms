package Printer;

import Formatter.GameType;

public class MenuPrinter extends Printer {
    private final String DESCRIPTION_MAIN = """
                    1.Show games list.
                    2.Show full match history.
                    3.Search match history by filter.
                    4.Add match.
                    5.Delete match.
                    6.Sort by parameter match history.
                    To stop the program enter exit
                    """;
    private final String GAME_DESCRIPTION =
            String.valueOf(GameType.CS) + " " +
            String.valueOf(GameType.DOTA2) + " " +
            String.valueOf(GameType.FIFA) + " " +
            String.valueOf(GameType.NFS);

    private final String DESCRIPTION2 = "Choose game to show matches: ";

    public void printDescription (){
        printLine(DESCRIPTION_MAIN);
    }

    public void printDescription1 (){
        printLine(GAME_DESCRIPTION);
    }

    public void printDescription2(){
        printLine(DESCRIPTION2);

    }



}
