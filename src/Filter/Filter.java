package Filter;
import Match.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Filter {
    public List<Match> filterByDate(List<? extends Match> matches, LocalDate startDate, LocalDate endDate){
        Stream<? extends Match> stream;
        return (List<Match>) matches.stream().filter(match -> match.getDate().isAfter(startDate) && match.getDate().isBefore(endDate)).toList();
    }

}
