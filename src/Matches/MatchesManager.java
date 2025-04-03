package Matches;

import Formatter.GameType;
import Match.*;

import java.util.ArrayList;
import java.util.List;

public class MatchesManager {
    private final List<CsMatch> csMatches;
    private final List<Dota2Match> dota2Matches;
    private final List<FifaMatch> fifaMatches;
    private final List<NfsMatch> nfsMatches;

    public MatchesManager(){
        csMatches = new ArrayList<>();
        dota2Matches = new ArrayList<>();
        fifaMatches = new ArrayList<>();
        nfsMatches = new ArrayList<>();
    }

    public void addMatch(Match match){
        if (match instanceof CsMatch){
            csMatches.add((CsMatch) match);
        }
        else if(match instanceof Dota2Match){
            dota2Matches.add((Dota2Match) match);
        }
        else if(match instanceof FifaMatch){
            fifaMatches.add((FifaMatch) match);
        }
        else if(match instanceof NfsMatch){
            nfsMatches.add((NfsMatch) match);
        }
    }

    public List<? extends Match> getByType(GameType type){
        switch (type){
            case CS -> {return this.getCsMatches();}
            case DOTA2 -> {return this.getDota2Matches();}
            case FIFA -> {return this.getFifaMatches();}
            case NFS -> {return this.getNfsMatches();}
            default -> {return null;}
        }
    }



    public List<CsMatch> getCsMatches() {
        return csMatches;
    }

    public List<Dota2Match> getDota2Matches() {
        return dota2Matches;
    }

    public List<FifaMatch> getFifaMatches() {
        return fifaMatches;
    }

    public List<NfsMatch> getNfsMatches() {
        return nfsMatches;
    }
}
