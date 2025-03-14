package Match;

import java.time.LocalDate;
import java.util.Date;

public class FifaMatch extends Match {
    String clubName;
    int teamRate;
    int goals;
    int missedGoals;

    public FifaMatch(LocalDate date, String result, String clubName, int teamRate, int goals, int missedGoals){
        super(date, result);
        this.setClubName(clubName);
        this.setTeamRate(teamRate);
        this.setGoals(goals);
        this.setMissedGoals(missedGoals);
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setTeamRate(int teamRate) {
        this.teamRate = teamRate;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setMissedGoals(int missedGoals) {
        this.missedGoals = missedGoals;
    }

    public int getGoals() {
        return goals;
    }

    public String getClubName() {
        return clubName;
    }

    public int getTeamRate() {
        return teamRate;
    }

    public int getMissedGoals() {
        return missedGoals;
    }

    @Override
    public String toString(){
        return (this.getDate() + " " +
                this.getResult() + " " +
                this.getClubName() + " " +
                this.getTeamRate() + " " +
                this.getGoals() + " " +
                this.getMissedGoals());

    }
}
