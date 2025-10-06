// package student.FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
     public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) return null;
        DateTimeFormatter dtfft = DateTimeFormatter.ofPattern("'Le' dd MMM 'de l''an' yyyy 'à' HH'h'mm'm' 'et' ss's'", Locale.FRANCE);
        return dtfft.format(dateTime);
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) return null;
        DateTimeFormatter dtfs = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return dtfs.format(date);

    }

    public static String formatIso(LocalTime time) {
        if (time == null) return null;
        DateTimeFormatter dtfi = DateTimeFormatter.ofPattern("HH:mm:ss");
        return dtfi.format(time);
    }
    //  public static void main(String[] args) {
    //     System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22, 13, 25, 46)));
    //     System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
    //     System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));
    // }
}
