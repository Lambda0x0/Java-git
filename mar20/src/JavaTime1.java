import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTime1 {
    
    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(2010, 2, 22); // creo la data 22/2/2010
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ITALY);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yy").withLocale(Locale.ITALY);
        // dd: 2 cifre per il giorno; MM: 2 cifre per il mese; yyyy: 4 cifre per l'anno
        // pattern: modello di rappresentazione
        System.out.println("Oggi è il " + dataLocale.format(formatter) + ", ovvero " + dataLocale.format(formatter2));
        // dataLocale contiene yyyy (year) che vale 2010, MM (month) che vale 2, dd (dayOfMonth) che vale 22
    }

}