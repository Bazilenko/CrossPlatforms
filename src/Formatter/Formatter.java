package Formatter;

import java.time.format.DateTimeFormatter;

public class Formatter {
    private final String STATEMENT_HEADER = "DATE / TIME | RESULT";
    private final String CSMATCH_HEADER = "ID | DATE | MAP | RESULT | K | A | D | TYPE";
    private final String DOTA2_HEADER = "ID | DATE / TIME | RESULT | HERO PLAYED | TYPE";
    private final String FIFA_HEADER = "ID | DATE / TIME | CLUB NAME | RESULT | TEAM RATE| TYPE";
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getStatementHeader() {
        return this.STATEMENT_HEADER;
    }

    public String getDOTA2_HEADER() {
        return DOTA2_HEADER;
    }

    public String getCSMATCH_HEADER() {
        return CSMATCH_HEADER;
    }

    public String getFifaHeader() {
        return FIFA_HEADER;
    }

    public DateTimeFormatter getDateFormat() {
        return this.dateFormatter;
    }
}
