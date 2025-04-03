package Printer;

import Formatter.Formatter;
import Formatter.GameType;
import Matches.MatchesManager;
import Match.Match;

import java.util.List;

public class MatchesPrinter extends Printer {
    private final MatchesManager manager;

    public MatchesPrinter(MatchesManager manager) {
        this.manager = manager;
    }

    public void printMatchesInfo(List<? extends Match> matches, String formatter) {
        printLine(formatter);
        if (!matches.isEmpty()) {
            for (Match match : matches) {
                printLine(match.toString());
            }
        } else {
            System.out.println("Match history is empty!!!");
        }
    }

    public void printByType(GameType type) {
        Formatter formatter = new Formatter();
        switch (type) {
            case CS ->{
                printMatchesInfo(manager.getCsMatches(), formatter.getCSMATCH_HEADER());
            }
            case DOTA2 -> printMatchesInfo(manager.getDota2Matches(), formatter.getCSMATCH_HEADER());
            case FIFA -> printMatchesInfo(manager.getFifaMatches(), formatter.getFifaHeader());
            default -> System.out.println("Unknown game type!");
        }
    }
}
