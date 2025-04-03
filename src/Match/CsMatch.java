package Match;

import Formatter.GameType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;
import java.util.List;
import java.util.Date;
public class CsMatch extends Match {
    private String type;
    private String map;
    private int deaths = 0;
    private int kills = 0;
    private int assists = 0;
    public CsMatch(LocalDate date, String result, int kills, int deaths, int assists, String map) {
        super(date, result);
        this.map = map;
        this.deaths = deaths;
        this.kills = kills;
        this.assists = assists;
        this.type = "cs";
    }
    public CsMatch(){

    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setMap(String map) {
        this.map = map;
    }


    public int getAssists() {
        return this.assists;
    }

    public int getDeaths() {
        return this.deaths;
    }

    public int getKills() {
        return this.kills;
    }

    public String getMap() {return this.map;}


    @Override
    public String toString(){
        return (this.getId() + " " +
                this.getDate() + " " +
                this.getMap() + " " +
                this.getResult() + " " +
                this.getKills() + " " +
                this.getAssists() + " " +
                this.getDeaths() + " ");
    }
}
