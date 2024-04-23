// la classe che avvia il programma generalmente contiene "Test" nel proprio nome
// ovviamente la classe di avvio del programma DEVE ESSERE public!!!
public class CamiciaTest {
    
    public static void main(String[] args) {
        // public: è la "chiave di accensione" del programma, DEVE ESSERE public
        // static: il metodo funziona direttamente dalla classe, non creo un'istanza
        // void: essendo il metodi di avvio, non può trasmettere dati a qualcosa di precedente che non c'è
        // main: nome del metodo di avvio, da scrivere SEMPRE esattamente così
        // String[] args (scritto anche String args[]): "fossile" di programmazione, si usava una volta per ricevere input esterni da terminale, ora si usano altre procedure
        Camicia miaCamicia; // dichiaro un oggetto di tipo Camicia di cui ho la classe
        miaCamicia = new Camicia(); // creo l'oggetto miaCamicia che assume tutti i valori iniziali delle variabili della classe di origine
        miaCamicia.mostraInformazioni(); // creato l'oggetto, posso accedere a tutti i suoi parametri public
        miaCamicia.camiciaID = 2024; // camiciaID è public, posso impostarla dall'esterno
        miaCamicia.prezzo = 45.53; // imposto anche il prezzo
        miaCamicia.mostraInformazioni(); // ristampo le informazioni dopo le modifiche

        Camicia tuaCamicia = new Camicia(); // dichiarazione e creazione di un oggetto in unica istruzione
        tuaCamicia.mostraInformazioni(); // nuovo oggetto, tutti i campi ripartono dai valori iniziali
    }

    @Override
    public String toString() {
        return "CamiciaTest []";
    }

}