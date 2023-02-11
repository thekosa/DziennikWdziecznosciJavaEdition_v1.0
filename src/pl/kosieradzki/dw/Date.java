package pl.kosieradzki.dw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final LocalDate date = LocalDate.now();

    public LocalDate getDate() {
        return date;
    }

    public String toString() {
        return dtf.format(date);
    }
}
