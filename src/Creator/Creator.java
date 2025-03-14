package Creator;

import Formatter.GameType;
import java.util.Scanner;
import Match.CsMatch;

public class Creator {
    Scanner scanner;

    public CsMatch createMatch(GameType game){
        switch (game) {
            case CS ->{
                CsCreator creator = new CsCreator();
                creator.createCsMatch();
            }
            default -> System.out.println("Unknown type!");
        }
        return null;
    }
}


