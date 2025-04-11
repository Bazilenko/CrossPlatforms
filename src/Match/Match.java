package Match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import Formatter.*;

import java.text.Format;
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

    Formatter formatter;

    public Match(LocalDate date, String result){
        this.date = date;
        this.result = result;
        this.ID = generalId++;
        formatter = new Formatter();
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

    public void setFormatter(Formatter formatter){
        this.formatter = formatter;
    };


    @Override
    public String toString(){
        return (this.getDate() + " " +
                this.getResult());
    }

}
