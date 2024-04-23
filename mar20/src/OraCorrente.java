import java.util.Calendar;
import java.util.GregorianCalendar;

public class OraCorrente {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(); // GregorianCalendar sottoclasse di Calendar (non mi servono i metodi specifici della sottoclasse)
        
        // salvo in opportune variabili, i parametri dell'ora al momento in cui si lancia il programma
        int ore = calendar.get(Calendar.HOUR); // prelevo l'ora, HOUR è static
        int minuti = calendar.get(Calendar.MINUTE); // prelevo i minuti, MINUTE è static
        int secondi = calendar.get(Calendar.SECOND); // prelevo i secondi, SECOND è static
        System.out.println("Sono le " + ore + ":" + minuti + ":" + secondi);
    }

}