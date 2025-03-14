package Match;

import java.time.LocalDate;
public abstract class Match {
    String result;
    LocalDate date;

    public Match(LocalDate date, String result){
        this.date = date;
        this.result = result;
    }
    public String getResult(){
        return this.result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setResult(String res){
        if(res.equals("Vicrory") || res.equals("Loss") || res.equals("Tie"))
            this.result = res;
        System.out.println("Unknown result!");
    }

    @Override
    public String toString(){
        return (this.getDate() + " " +
                this.getResult());
    }

}
