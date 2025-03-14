package Creator;

import Formatter.CsFormatter;
import Match.CsMatch;
import Match.CsMatchType;

import java.time.LocalDate;

public class CsCreator extends Creator {
    public CsMatch createCsMatch(){
        CsFormatter formatter = new CsFormatter();
        System.out.print("Enter date of played match (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter.getDateFormat());

        System.out.print("Enter map of played match: ");
        String map = scanner.nextLine();

        System.out.print("Enter type of played match: ");
        String strType = scanner.nextLine();
        CsMatchType type = CsMatchType.valueOf(strType.toUpperCase());

        System.out.print("Enter the result: ");
        String result = scanner.nextLine();

        System.out.print("Enter quantity of kills: ");
        int kills = scanner.nextInt();

        System.out.print("Enter quantity of assists: ");
        int assists = scanner.nextInt();

        System.out.print("Enter quantity of deaths: ");
        int deaths = scanner.nextInt();

        return new CsMatch(date, result, kills, deaths, assists, map, type);
    }
}
