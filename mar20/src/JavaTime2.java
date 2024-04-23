import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaTime2 {
    
    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(1975, 3, 7);
        // la data può essere visualizzata anche usando dei pattern (modelli) pronti
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);
        System.out.println("Data di nascita con formattazione FULL: " + dataLocale.format(formatter));
    }

}
