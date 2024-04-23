public class CamiciaCTest {
    public static void main(String[] args) {
        //creazione di una camicia con costruttore personalizzato che invia le caratteristiche da inizializzare
        int id = 1234;//valore che voglio assegnare a camiciaID
        String de = "Modello sportivo"; //valore che voglio assegnare a descrizione
        char cc = 'F'; //valore che voglio assegnare a codice colore 
        double pr = 315.99; //valore che voglio assegnare a prezzo
        char st = 'F';//valore che voglio assegnare a stile

        Camicia miaCamicia = new Camicia(id, de, cc, pr, st);
        
        miaCamicia.display();
    }
}