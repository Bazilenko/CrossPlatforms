package Match;

import java.time.LocalDate;
import java.util.List;
import java.util.Date;

public class CsMatch extends Match {
    private String map;
    private int deaths = 0;
    private int kills = 0;
    private int assists = 0;
    private CsMatchType type;
    List<Match> matches;

    public CsMatch(LocalDate date, String result, int kills, int deaths, int assists, String map, CsMatchType type) {
        super(date, result);
        this.map = map;
        this.deaths = deaths;
        this.kills = kills;
        this.assists = assists;
        this.type = type;
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

    public void setType(CsMatchType type) {
        this.type = type;
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

    public String getMap() {return map;}

    public CsMatchType getCsMatchType(){
        return this.type;
    }

    @Override
    public String toString(){
        return (this.getDate() + " " +
                this.getMap() + " " +
                this.getResult() + " " +
                this.getKills() + " " +
                this.getAssists() + " " +
                this.getDeaths() + " " +
                this.getCsMatchType());
    }
}
