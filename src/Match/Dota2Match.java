package Match;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;
import java.util.Date;
public class Dota2Match extends Match{
    private String type;
    String heroName;

    public Dota2Match(LocalDate date, String result, String heroName){
        super(date, result);
        this.setHeroName(heroName);
        this.type = "dota2";
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }


    public String getHeroName() {
        return heroName;
    }

    @Override
    public String toString(){
        return (this.getId() + " " +
                this.getDate() + " " +
                this.getResult() + " " +
                this.getHeroName() + " "
                );
    }
}
