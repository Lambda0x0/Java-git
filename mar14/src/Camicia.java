import java.util.Scanner;

public class Camicia {
    // campi private perché la classe è incapsulata, quindi non accessibili dall'esterno
    private int camiciaID;
    private String descrizione = "descrizione mancante";
    private char codiceColore = 'U'; // R = red, B = blue, G = green, W = white
    private double prezzo;
    private int disponibili; // quante camicie ci sono in magazzino per l'istanza richiamata
    private int acquistate; // quante camicie si vuole acquistare dell'istanza richiamata

    // creo un costruttore personalizzato, per CamiciaCTest
    public Camicia(int camiciaID, String descrizione, char codiceColore, double prezzo, int disponibili, int acquistate) {
        this(codiceColore); // delego la gestione del codiceColore al costruttore "dedicato"
        setCamiciaID(camiciaID);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setDisponibili(disponibili);
        setAcquistate(acquistate);
    }

    // creo un costruttore personalizzato per la gestione del codiceColore
    public Camicia(char codiceColore) {
        setCodiceColore(codiceColore);
    }

    // rigenero il costruttore predefinito avendone creato uno personalizzato
    public Camicia() {}

    // creo due istanze di Scanner per gestire separatamente numeri e testi
    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);

    // inizio incapsulamento
    public void setCamiciaID(int camiciaID) {
        /* metodo setter: ha sempre return_type void
        *  generalmente ha nome set+NomeVariabile
        *  riceve un argomento del tipo del campo private da inizializzare
        *  l'argomento generalmente è omonimo della variabile private da inizializzare */
        // regola: ID di 4 cifre e positivo
        boolean ancora = true;

        do {

            if (camiciaID > 999 && camiciaID < 10000) { // se la regola è rispettata
                this.camiciaID = camiciaID; // assegno l'argomento del setter al private (col this)
                ancora = false;
            } else { // se la regola non è rispettata
                System.out.println("Gli ID devono essere di 4 cifre e positivi"); // ribadisco la regola
                System.out.print("Inserisci l'ID della camicia: ");
                camiciaID = inputNumeri.nextInt();
            }

        } while(ancora);

    }

    public int getCamiciaID() {
        /* metodo getter: ha sempre return_type uguale al tipo del campo private da recuperare
        * non riceve argomenti */
        return camiciaID; // non occorre this poiché il camiciaID del setter è variabile locale
    }

    public void setDescrizione(String descrizione) {
        // regola: descrizione di almeno 8 caratteri
        boolean ancora = true;

        do {
            
            if (descrizione.length() >= 8) { // se la regola è rispettata
                this.descrizione = descrizione;
                ancora = false;
            } else { // se la regola non è rispettata
                System.out.println("Le descrizioni devono essere di almeno 8 caratteri");
                System.out.print("Inserisci la descrizione: ");
                descrizione = inputTesti.nextLine();
            }

        } while(ancora);
        
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCodiceColore(char codiceColore) {
        // regola: sono accettati soltanto i char 'R' = red, 'B' = blue, 'G' = green, 'W' = white
        boolean ancora = true;

        do {

            switch(codiceColore) {
                case 'R', 'B', 'G', 'W': // se la regola è rispettata
                    this.codiceColore = codiceColore;
                    ancora = false;
                    break;
                default: // se la regola non è rispettata
                    System.out.println("Sono accettati i codici colore R = red, B = Blue, G = Green, W = white");
                    System.out.print("Inserisci il codice colore: ");
                    codiceColore = inputTesti.nextLine().toUpperCase().charAt(0);
            }

        } while(ancora);

    }

    public char getCodiceColore() {
        return codiceColore;
    }

    public void setPrezzo(double prezzo) {
        // regola: prezzo > 0 e prezzo <= 300
        boolean ancora = true;

        do {

            if (prezzo > 0 && prezzo <= 300) { // se la regola è rispettata
                this.prezzo = prezzo;
                ancora = false;
            } else {
                System.out.println("I prezzi in euro devono essere positivi e non superiori a 300");
                System.out.print("Inserisci il prezzo: ");
                prezzo = inputNumeri.nextDouble();
            }

        } while(ancora);

    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setDisponibili(int disponibili) {
        // regola: disponibili > 0
        boolean ancora = true;

        do {

            if (disponibili > 0) { // se la regola è rispettata
                this.disponibili = disponibili;
                ancora = false;
            } else { // se la regola non è rispettata
                System.out.println("Le quantità devono essere positive");
                System.out.print("Inserisci la quantità disponibile: ");
                disponibili = inputNumeri.nextInt();
            }

        } while(ancora);

    }

    public int getDisponibili() {
        return disponibili;
    }

    public void setAcquistate(int acquistate) {
        // regola: acquistate > 0 && acquistate <= disponibili
        boolean ancora = true;

        do {

            if (acquistate > 0 && acquistate <= getDisponibili()) { // se la regola è rispettata
                // acquistate <= disponibili violerebbe l'incapsulamento poiché disponibili è private e vi si deve accedere in lettura ESCLUSIVAMENTE ATTRAVERSO IL SUO GETTER
                this.acquistate = acquistate;
                ancora = false;
            } else { // se la regola non è rispettata
                System.out.println("Non si possono acquistare meno di 1 camicia e più di quante ce ne sono disponibili");
                System.out.print("Immettere la quantità desiderata: ");
                acquistate = inputNumeri.nextInt();
            }

        } while(ancora);

    }

    public int getAcquistate() {
        return acquistate;
    }
    // fine incapsulamento

    public void display() { // siccome il metodo verrà invocato da un caller esterno, occorre rispettare l'incapsulamento
        System.out.println("ID della camicia: " + getCamiciaID());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Prezzo unitario: " + getPrezzo() + " euro");
        System.out.println("Quantità disponibili: " + getDisponibili());
        System.out.println("Quantità acquistate: " + getAcquistate());
        System.out.println("Prezzo totale: " + (getAcquistate()*getPrezzo()) + " euro");
    }

}