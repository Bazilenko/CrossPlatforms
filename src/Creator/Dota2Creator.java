package Creator;

import Formatter.Formatter;
import Match.Dota2Match;
import Match.Dota2MatchType;

import java.time.LocalDate;

public class Dota2Creator extends Creator{
    public Dota2Match createDota2Match(){
        Formatter formatter = new Formatter();
        System.out.print("Enter date of played match (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter.getDateFormat());


        System.out.print("Enter the result(win/lose): ");
        String result = scanner.nextLine();

        System.out.println("Enter name of played hero: ");
        String heroName = scanner.nextLine();

        System.out.println("Match added");
        return new Dota2Match(date, result, heroName);

    }
}
