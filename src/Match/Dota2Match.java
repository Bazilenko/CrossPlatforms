package Match;

import java.time.LocalDate;
import java.util.Date;

public class Dota2Match extends Match{
    String heroName;
    Dota2MatchType type;

    public Dota2Match(LocalDate date, String result, String heroName, Dota2MatchType type){
        super(date, result);
        this.setHeroName(heroName);
        this.setType(type);
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setType(Dota2MatchType type) {
        this.type = type;
    }

    public Dota2MatchType getType() {
        return type;
    }

    public String getHeroName() {
        return heroName;
    }
}
