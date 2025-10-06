
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null)
            return null;
        LocalDateTime ldt = LocalDateTime.parse(stringDate);
        return ldt;
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null)
            return null;
        DateTimeFormatter dtf = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE dd MMMM yyyy")
                .toFormatter(Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(stringDate, dtf);
        return ld;
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null)
            return null;
        String rStr = stringDate.replace("morning", "AM").replace("evening", "PM");
        DateTimeFormatter dtf = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("hh 'hours in the' a, mm 'minutes and' ss 'seconds'")
                .toFormatter(Locale.ENGLISH);
        return LocalTime.parse(rStr, dtf);
    }
}
