public class Camicia {
    // campi o variabili globali
    public int camiciaID = 0; // sintassi: modifier tipo identificativo = valore
    public String descrizione = "Descrizione mancante";
    public char codiceColore = 'U';
    public double prezzo = 0.0;
    public int quantita = 0;

    // metodo
    public void mostraInformazioni() {
        System.out.println("Quantità di camicie: " + quantita + ", di colore: " + codiceColore +" e identificativo: " + camiciaID);
    }

}