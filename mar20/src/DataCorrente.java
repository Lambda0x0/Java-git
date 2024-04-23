import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataCorrente {
    
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        // tutti i campi prelevati sono static
        int giorno = calendar.get(Calendar.DAY_OF_MONTH);
        int mese = calendar.get(Calendar.MONTH);
        int anno = calendar.get(Calendar.YEAR);
        System.out.println("Oggi è il " + giorno + "/" + (mese + 1) + "/" + anno);
        // in Calendar i mesi partono da 0, come array, ArrayList, indici delle String, ...
    }
    
}