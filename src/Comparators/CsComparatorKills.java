package Comparators;

import Match.CsMatch;

import java.util.Comparator;

public class CsComparatorKills implements Comparator<CsMatch> {
    public int compare(CsMatch a, CsMatch b){
        return Integer.compare(a.getKills(), b.getKills());
    }
}
