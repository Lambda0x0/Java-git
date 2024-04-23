public class Camicia extends Abbigliamento implements Restituibile {
    // extends collega Camicia ad Abbigliamento, in questo modo è come se TUTTO IL CODICE di Abbigliamento fosse scritto in Camicia; inoltre Camicia EREDITA il fatto che ci sono metodi astratti e LI DEVE IMPLEMENTARE
    // implements collega Camicia a Restituibile che è una interfaccia, per cui la classe DEVE IMPLEMENTARE quanto dichiarato nell'interfaccia
    private char stile = 'U'; // campo non presente in tutti i capi di abbigliamento, legittimo scriverlo qui; può assumere i valori 'E' = elegante, 'S' = sportiva
    private String testo;

    // costruttore personalizzato
    public Camicia(int elementoID, String descrizione, char codiceColore, double prezzo, char stile, int giorni) { // devo inserire tutti i campi perché è come se fossero scritti in questa classe
        super(elementoID, descrizione, codiceColore, prezzo); // delego al costruttore della superclasse la gestione (incapsulamento) di quanto è implementato lì
        setCodiceColore(codiceColore); // qui finalmente invoco il setter nella classe opportuna
        setStile(stile); // setter non presente in superclasse
        restituisci(giorni); // metodo dell'interfaccia
    }

    // rigenero il costruttore predefinito
    public Camicia() {}

    // inizio incapsulamento
    public void setCodiceColore(char codiceColore) { // implemento il metodo abstract della superclasse
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

    public char getCodiceColore() { // implemento il metodo abstract della superclasse
        return codiceColore;
    }

    public void setStile(char stile) {
        // regola: sono accettati soltanto i char 'E' = elegante, 'S' = sportiva
        boolean ancora = true;

        do {

            if (stile == 'E' || stile == 'S') { // se la regola è rispettata
                this.stile = stile;
                ancora = false;
            } else {
                System.out.println("Sono accettati gli stili E = elegante, S = sportiva");
                System.out.print("Inserisci lo stile: ");
                stile = inputTesti.nextLine().toUpperCase().charAt(0);
            }

        } while(ancora);

    }

    public char getStile() {
        return stile;
    }
    // fine incapsulamento

    // implemento il metodo dell'interfaccia
    public void restituisci(int giorni) {
        // regola: giorni positivi e non eccessivamente troppi
        boolean ancora = true;

        do {

            if (giorni > 0 && giorni <= 15) {
                testo = "La camicia va restituita entro " + giorni + " giorni";
                ancora = false;
            } else {
                System.out.println("I giorni devono essere tra 1 e 15");
                System.out.print("Reinserisci: ");
                giorni = inputNumeri.nextInt();
            }

        } while (ancora);

    }

    // faccio override di display(): ri implemento nella sottoclasse un metodo già implementato nella superclasse. NB: i due metodi DEVONO AVERE LA STESSA FIRMA!
    // il metodo della sottoclasse sovrascrive/occulta il metodo omonimo della superclasse
    public void display() {
        System.out.println("ID della camicia: " + getElementoID());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Codice di stile: " + getStile());
        System.out.println("Prezzo unitario: " + getPrezzo() + " euro");
        System.out.println(testo);
    }

}