package Comparators;

import Match.Dota2Match;

import java.util.Comparator;

public class Dota2ComparatorDate implements Comparator<Dota2Match> {
    public int compare(Dota2Match a, Dota2Match b){
        return a.getDate().compareTo(b.getDate());
    }
}
