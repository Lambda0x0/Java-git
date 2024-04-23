public class ClientiPizzeriaTest {
    
    public static void main(String[] args) {
        String ordinazioneSimone = "Pizza diavola";
        String ordinazioneElisabetta = "Pizza poker";
        String ordinazioneFroy = "Pizza margherita";
        String bevanda = "Vino della casa";
        System.out.println("I clienti elencano al cameriere Yuri le ordinazioni: " + ordinazioneSimone + ", " + ordinazioneElisabetta + ", " + ordinazioneFroy + ", " + bevanda);

        Cameriere Yuri = new Cameriere();
        Yuri.comanda(ordinazioneSimone, ordinazioneElisabetta, ordinazioneFroy, bevanda); // il caller main() invoca il worker comanda()

        System.out.println("I tre amici gustano le pizze discorrendo simpaticamente.");
    }
    
}