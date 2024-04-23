public class SupermercatoTest {
    
    public static void main(String[] args) {
        Cassa miaCassa = new Cassa(); // istanzio una cassa
        Prodotto prodotto1 = new Prodotto(); // istanzio un prodotto da acquistare
        
        // compro tre pacchi di pasta La Molisana
        prodotto1.descrizione = "Pasta La Molisana 500g";
        prodotto1.prezzo = 1.10;
        prodotto1.quantita = 3;

        Prodotto prodotto2 = new Prodotto(); // istanzio un altro prodotto da acquistare

        // compro 2 buste di latte d'avena
        prodotto2.descrizione = "Latte d'avena 1l";
        prodotto2.prezzo = 1.69;
        prodotto2.quantita = 2;

        Prodotto prodotto3 = new Prodotto(); // istanzio un altro prodotto da acquistare

        // compro una lattina da 5 litri di olio d'oliva
        prodotto3.descrizione = "Olio d'oliva 5l";
        prodotto3.prezzo = 35.70;
        prodotto3.quantita = 1;

        // i prodotti, messi nel carrello, passano alla cassa che effettua i conti...
        double costoTotale = miaCassa.aggiungiProdotto(prodotto1) + miaCassa.aggiungiProdotto(prodotto2) + miaCassa.aggiungiProdotto(prodotto3); // i metodi con un return possono essere usati come variabili poiché sommo tranquillamente i vari return di tipo double
        
        // stampo il totale da pagare
        System.out.println("Totale da pagare: " + costoTotale + " euro");
    }

}