public class CamiciaTest {
    
    public static void main(String[] args) {
        Camicia miaCamicia = new Camicia(); // prima istanza
        Camicia tuaCamicia = new Camicia(); // seconda istanza
        miaCamicia = tuaCamicia; // rendo uguali i due riferimenti, puntano alla stessa memoria
        miaCamicia.codiceColore = 'R'; // assegno 'R' a codiceColore di miaCamicia
        tuaCamicia.codiceColore = 'G'; // assegno 'G' a codiceColore di tuaCamicia
        System.out.println("Codice colore miaCamicia: " + miaCamicia.codiceColore);
        // a causa del rigo 6, perdo il valore di 'R', sovrascritto da 'G' perché i due riferimenti miaCamicia e tuaCamicia puntano alla stessa memoria (a tutte le memorie delle variabili)
        System.out.println("Codice colore tuaCamicia: " + tuaCamicia.codiceColore);
    }

}