package Matches;

import java.util.List;
import Match.*;
public class Matches {
    List<Match> matches;

    public void addMatch(Match match){
        matches.add(match);
    }

    public List<Match> getMatches() {
        return matches;
    }
}
