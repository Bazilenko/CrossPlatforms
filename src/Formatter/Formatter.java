package Formatter;

import java.time.format.DateTimeFormatter;

public abstract class Formatter {
    private final String STATEMENT_HEADER = "DATE / TIME | RESULT";
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getStatementHeader() {
        return this.STATEMENT_HEADER;
    }

    public DateTimeFormatter getDateFormat() {
        return this.dateFormatter;
    }
}
