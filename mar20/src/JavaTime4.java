import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaTime4 {
    
    public static void main(String[] args) {
        Instant start = Instant.now();
        LocalDate d = LocalDate.now(); // now() preleva tutti i dati temporali dal sistema
        
        // estraggo da d i dati che mi servono, come facevo con Calendar che però è incompatibile con le classi di java.time
        int giorno = d.get(ChronoField.DAY_OF_MONTH);
        int mese = d.get(ChronoField.MONTH_OF_YEAR);
        int anno = d.get(ChronoField.YEAR);

        // altra data costruita "manualmente", quindi da formattare
        LocalDate dataLocale = LocalDate.of(2024, 3, 20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // stampo le due date
        System.out.println("Data odierna manuale: " + dataLocale.format(formatter));
        System.out.println("Data odierna con now(): " + d.format(formatter));
        System.out.println("Data senza pattern: " + giorno + "/" + mese + "/" + anno);
        // seconda e terza stampa si aggiornano automaticamente al cambiare del giorno

        Instant end = Instant.now();
        System.out.println("Tempo di esecuzione del programma: " + (end.getNano() - start.getNano()));
    }

}