package Printer;

import Formatter.Formatter;
import Match.Match;

public abstract class MatchPrinter extends Printer{
    public void printHeader(Formatter formatter){
        printLine(formatter.getStatementHeader());
    }

    public void printMatchInfo(Match match){
        printLine(match.toString());
    }
}
