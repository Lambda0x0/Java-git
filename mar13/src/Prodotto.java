public class Prodotto {
    public int prodottoID; // campo utile per eventuale inventario...
    public String descrizione = "descrizione mancante";
    public int quantita;
    public double prezzo;

    // metodo che stampa le caratteristiche dell'oggetto istanziato
    public void display() {
        System.out.println("ID del prodotto: " + prodottoID);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo unitario: " + prezzo + " euro");
    }

}