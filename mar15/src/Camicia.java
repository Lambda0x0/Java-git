public class Camicia extends Abbigliamento {// exstende Abbigliamento collega camica con abbigliamento, in questo modo è
    // come se tutto il codice di Abbigliamento fosse dentro Camicia; camicia
    // eredita il fatto che ci sono metodi stratti e li deve implementare

    private char stile = 'U'; // questo è un campo non presente in tutti i capi di abbigliamento, legittimo
    // scriverlo qui; puo assumere i valori
    // 'E' = elegante, 'S' = sportiva

    // costruttore personalizzato
    public Camicia(int elementoID, String descrizione, char codiceColore, double prezzo, char stile) { // devo inserire
        // tutti i campi
        // è come se
        // fossero
        // scritti in
        // questa classe

        super(elementoID, descrizione, codiceColore, prezzo); // delego al costruttore della superclasse la gestione
        // (incapsulamento) di quanto è implementato li

        setCodiceColore(codiceColore);// qui finalemnte invoco il setter nella classe opportuna
        setStile(stile);// setter non presente in superclasse
    }

    // rigenero il costruttore predefinito
    public Camicia() {
    }

    // inizio incapsulamento

    public void setCodiceColore(char codiceColore) {// implemento il metodo abstract della superclasse
        // regola: sono accettati soltanto i char 'R' = red , 'B' = blue , 'G' = green ,
        // 'W' = white
        boolean ancora = true;

        do {

            switch (codiceColore) {
                case 'R', 'B', 'G', 'W': // se la regola è rispettata
                    this.codiceColore = codiceColore;
                    ancora = false;
                    break;
                default: // se la regola non è rispettata
                    System.out.println("Sono accettati i codici colore R= red, B = blue, G = green, W = white");
                    System.out.println("Inserisci il codice colore: ");
                    codiceColore = inputTesti.nextLine().toUpperCase().charAt(0);
            }
        } while (ancora);
    }

    public char getCodiceColore() {// implemento il metodo abstract della superclasse
        return codiceColore;
    }

    public void setStile(char stile) {
        // regloa: sono accettati solo i char 'E' = elegante, 'S' = sportiva
        boolean ancora = true;
        do {
            if (stile == 'E' || stile == 'S') {// se la regola è rispettata
                this.stile = stile;
                ancora = false;
            } else {
                System.out.println("Sono accettati gli stili E = elegante, S = sportiva");
                System.out.println("Inserisci lo stile: ");
                stile = inputTesti.nextLine().toUpperCase().charAt(0);
            }

        } while (ancora);
    }

    public char getStile() {
        return stile;
    }
    // fine incapsulamento

    // faccio override di dispaly(): si implementano nella sottoclasse un metodo gia
    // impelmentato nella superclasse NB i due metodi devono avere la stessa firma!
    // il metodo della sottoclasse sovrascrive/occulta il metodo onomimo della
    // superclasse
public void display() {
System.out.println("ID della camicia " + getElementoID());
System.out.println("descrizione: " + getDescrizione());
System.out.println("Codice colore:" + getCodiceColore());
System.out.println("Codice di stile: " + getStile());
System.out.println("Prezzo unitario: " + getPrezzo() + "Euro");
System.out.println("Test del getClass(): " + getClass());
}
}
