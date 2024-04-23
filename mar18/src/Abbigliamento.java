import java.util.Scanner;

public abstract class Abbigliamento { // classe abstract perché c'è almeno un elemento abstract
    // campi comuni a tutti i capi di abbigliamento
    private int elementoID; // non posso scrivere camiciaID poiché è un ID generico
    private String descrizione = "descrizione mancante";
    protected char codiceColore = 'U'; // protected: rende il campo accessibile dalla classe e dalle sue sottoclassi
    private double prezzo;

    // costruttore personalizzato (non è obbligatorio in tutte le classi che si creano)
    public Abbigliamento(int elementoID, String descrizione, char codiceColore, double prezzo) {
        setElementoID(elementoID);
        setDescrizione(descrizione);
        // setCodiceColore(codiceColore); il codice colore dipende all'oggetto specifico...
        setPrezzo(prezzo);
    }

    // rigenero il costruttore predefinito perché non so come verrà istanziata questa classe
    public Abbigliamento() {}

    // creo due istanze di Scanner per gestire separatamente numeri e testi
    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);

    // inizio incapsulamento
    public void setElementoID(int elementoID) {
        // regola: ID di 4 cifre e positivo
        boolean ancora = true;

        do {

            if (elementoID > 999 && elementoID < 10000) { // se la regola è rispettata
                this.elementoID = elementoID; // assegno l'argomento del setter al private (col this)
                ancora = false;
            } else { // se la regola non è rispettata
                System.out.println("Gli ID devono essere di 4 cifre e positivi"); // ribadisco la regola
                System.out.print("Inserisci l'ID del capo di abbigliamento: ");
                elementoID = inputNumeri.nextInt();
            }

        } while(ancora);

    }

    public int getElementoID() {
        return elementoID; // non occorre this poiché il camiciaID del setter è variabile locale
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

    // tutti i capi di abbigliamento hanno un colore, tuttavia i colori possibili possono variare da un tipo di abbigliamento all'altro
    public abstract void setCodiceColore(char codiceColore); // metodo solo dichiarato == è abstract

    public abstract char getCodiceColore(); // metodo solo dichiarato == è abstract
    // fine incapsulamento

    public void display() {
        System.out.println("ID dell'elemento " + getElementoID());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Prezzo unitario: " + getPrezzo() + " euro");
    }
    
}