import Match.Match;

import java.util.List;

public class User {
    String login;
    String password;
    double winRate;
    List<Match> matches;
    int wins = 0;
    int looses = 0;


    public User(String login, String password){
        this.setLogin(login);
        this.setPassword(password);
    }
    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }

    public void setLogin(String login){
        if (login.isEmpty())
            System.out.println("Invalid login format");
        this.login = login;
    }

    public double getWinRate(){
        return (double)(getWins() / getLooses());
    }


    public int getWins(){
        return this.wins;
    }

    public int getLooses(){
        return this.looses;
    }

    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("Weak password");
        }
        this.password = password;
    }

}
