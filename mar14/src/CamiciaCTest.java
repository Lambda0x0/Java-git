public class CamiciaCTest {
    
    public static void main(String[] args) {
        // creazione di una camicia con costruttore personalizzato che invia le caratteristiche da inizializzare
        int id = 1234; // valore che voglio assegnare a camiciaID
        String de = "Modello sportivo"; // valore che voglio assegnare a descrizione
        char cc = 'F'; // valore che voglio assegnare a codiceColore
        double pr = 315.99; // valore che voglio assegnare a prezzo
        int qd = 20; // valore che voglio assegnare a disponibili
        int qa = 22; // valore che voglio assegnare ad acquistate
        Camicia miaCamicia = new Camicia(id, de, cc, pr, qd, qa);
        miaCamicia.display();

        Camicia tuaCamicia = new Camicia(cc);
        tuaCamicia.display();
    }

}