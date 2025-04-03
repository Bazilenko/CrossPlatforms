package Match;

import Formatter.GameType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)

public abstract class Match {
    static int generalId = 1;

    int ID;
    String result;
    LocalDate date;

    public Match(LocalDate date, String result){
        this.date = date;
        this.result = result;
        this.ID = generalId++;
    }
    public Match(){

    }
    public String getResult(){
        return this.result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setResult(String res){
        this.result = res;
    }

    public int getId() {
        return ID;
    }


    @Override
    public String toString(){
        return (this.getDate() + " " +
                this.getResult());
    }

}
