package Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import Match.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Jackson {
    ObjectMapper mapper;
    String json;


    public Jackson(){

        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
    }

    public String serialization(Match match){
        try {
            json = mapper.writeValueAsString(match);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return json;
    }

    public Match deserialization(String json){
        Match m;
        try {
            m = mapper.readValue(json, Match.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return m;
    }

    public void writeToFile(String fileName, List<Match> match){
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("matches.json"), match);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Match> readFromFile(String fileName){
        List<Match> match = null;
        try {
            match = mapper.readValue(new File(fileName), new TypeReference<List<Match>>(){});
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return match;
    }


}
