import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTime3 {
    
    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(2024, 3, 20); // immetto un giorno
        LocalTime oraLocale = LocalTime.of(11, 20, 5); // immetto un'ora
        LocalDateTime dataOraLocale = LocalDateTime.of(dataLocale, oraLocale); // unisco data e ora
        ZoneId europa = ZoneId.of("Europe/Rome"); // specifico la zona geografica
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss").withZone(europa).withLocale(Locale.ITALY);
        // hh: 2 cifre per l'ora; mm: 2 cifre per i minuti; ss: 2 cifre per i secondi
        // withZone(europa) serve per sovrascrivere un null predefinito, al fine di ordinare dati inviati da diverse parti del mondo (non è questo il caso specifico)
        System.out.println("Data e ora formattati: " + dataOraLocale.format(formatter));
    }
    
}