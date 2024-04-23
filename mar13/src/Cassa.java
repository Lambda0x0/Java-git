public class Cassa {
    // classe che calcola il totale per ogni prodotto moltiplicando il prezzo per la quantità
    // il totale viene inviato/restituito al metodo che lancia/avvia aggiungiProdotto()
    public double prezzoTotale; // variabile dove si memorizzano i totali per ogni prodotto

    public double aggiungiProdotto(Prodotto mioProdotto) {
        /* public: il metodo deve essere invocato esternamente alla classe
         * double: il metodo deve restituire qualcosa (un totale) a un altro metodo (non più void)
         * Prodotto mioProdotto: il metodo riceve un'istanza e la può elaborare */
        prezzoTotale = mioProdotto.prezzo * mioProdotto.quantita;
        return prezzoTotale; // return: invia l'elemento prezzoTotale al metodo chiamante
    }

}