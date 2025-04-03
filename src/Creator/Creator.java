package Creator;

import Formatter.GameType;
import java.util.Scanner;
import Match.CsMatch;
import Match.Match;

public class Creator {
    Scanner scanner = new Scanner(System.in);

    public static Match createMatch(GameType game){
        switch (game) {
            case CS ->{
                CsCreator creatorCs = new CsCreator();
                return creatorCs.createCsMatch();
            }
            case DOTA2 -> {
                Dota2Creator creatorDota2 = new Dota2Creator();
                return creatorDota2.createDota2Match();
            }
            default -> System.out.println("Unknown type!");
        }
        return null;
    }
}


