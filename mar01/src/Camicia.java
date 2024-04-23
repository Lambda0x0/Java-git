// public: modifier (modificatore) che rende la classe accessibile dall'esterno
// class: dichiarazione di classe Java
// Camicia: nome della classe UGUALE al nome del file creato
public class Camicia {
    // variabili globali o campi
    public int camiciaID = 0; // int: tipo di variabile intera (numero intero)
    public String descrizione = "descrizione mancante"; // String: tipo di dato testuale
    public char codiceColore = 'U'; // char: tipo di variabile carattere (ipotetici valori accettati in Camicia: R = red, G = green, B = blue, W = white, U = unset)
    public double prezzo = 0.0; // double: tipo di variabile decimale (punto per separare dalla parte intera)
    public int quantita = 0; // int come rigo 6

    public void mostraInformazioni() { // void: indica che il metodo non fornisce un output all'esterno (metodo che chiama questo), eccetto lo scrivere su terminale
        // parentesti tonde vuote perché userà soltanto variabili globali della classe stessa
        // metodo per stampare su terminale
        // System: indico il package ("cartella di Java") contenente il metodo che serve
        // out: indico il campo degli output incluso quello su terminale
        // println(): metodo di Java per scrivere su terminale e andare a capo
        // sintassi analoga a quella per recuperare i value dei form tramite i name
        System.out.println("ID della camicia: " + camiciaID);
        System.out.println("Descrizione: " + descrizione); // sout o syso: scorciatoie per scrivere il println()
        System.out.println("Codice colore: " + codiceColore);
        System.out.println("Prezzo unitario: " + prezzo + " euro"); // posso concatenare più volte
        System.out.println("Quantità in magazzino: " + quantita);
        System.out.println(); // rigo vuoto
    }

}