import Creator.CsCreator;
import Formatter.Formatter;
import Formatter.GameType;
import Gson.Jackson;
import Match.*;
import Match.CsMatchType;
import Printer.MenuPrinter;
import Scan.MenuScan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Main{
    public static void main(String[] args){
        /*
        MenuScan menu = new MenuScan();
        menu.menuScan();
        */
        Formatter formatter = new Formatter();
        LocalDate date = LocalDate.parse("22/03/2024", formatter.getDateFormat());
        LocalDate date1 = LocalDate.parse("21/05/2024", formatter.getDateFormat());
        CsMatch cs = new CsMatch(date, "win", 1,2,3, "Dust2");
        CsMatch cs1 = new CsMatch(date, "lose", 10,2,13, "Mirage");
        Dota2Match d = new Dota2Match(date1, "win", "Lion");
        List<Match> m = new ArrayList<>();
        Jackson jackson = new Jackson();
        m.add(cs);
        m.add(cs1);
        m.add(d);
        jackson.writeToFile("matches.json", m);
        List<Match> ma = jackson.readFromFile("matches.json");
            System.out.println(ma);




    }





}

