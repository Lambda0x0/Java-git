public class ProveArray {

    public static void main(String[] args) {
        int[] anniNascita; // dichiaro un array di int
        anniNascita = new int[4]; // creo l'array di int dichiarato a rigo 4
        anniNascita[0] = 2003; // assegno 2003 al 1° elemento dell'array anniNascita
        anniNascita[3] = 1978; // assegno 1978 al 4° elemento dell'array anniNascita
        anniNascita[1] = 2020; // assegno 2020 al 2° elemento dell'array anniNascita
        anniNascita[2] = 1999; // assegno 1999 al 3° elemento dell'array anniNascita

        String[] nomi = new String[4]; // dichiaro e creo un array di String in unica istruzione
        nomi[3] = "Ferdinando";
        nomi[0] = "Ludovica";
        nomi[2] = "Valeria";
        nomi[1] = "Vittorio";

        for (int i = 0; i < anniNascita.length; i++) {
            System.out.println(nomi[i] + " ha anno di nascita " + anniNascita[i]);
        }

        System.out.println();

        Persona[] persone = new Persona[4]; // dichiaro e creo un array di oggetti Persona
        // in questo momento in persone ho quattro istanze di Persona, infatti posso accedere ai loro campi tramite l'indice dell'array persone
        persone[0] = new Persona(); // istanzio un oggetto di tipo Persona in persone[0]
        persone[1] = new Persona();
        persone[2] = new Persona();
        persone[3] = new Persona();
        persone[0].nome = "Michele"; // assegno "Ludovica" al nome della prima istanza di Persona
        persone[0].annoDiNascita = 1999; // assegno 2003 all'anno di nascita della prima istanza...
        persone[3].nome = "Mauro";
        persone[3].annoDiNascita = 2002;

        for (int j = 0; j < persone.length; j++) {
            persone[j].stampa();
        }

        System.out.println();

        String[] personaggi = {"Goku", "Vegeta", "Piccolo", "Gohan", "Freezer", "Trunks", "Mr Satan"}; // dichiaro, creo e inizializzo un array di String
        
        System.out.println("Elenco personaggi di Dragon Ball:");
        for (int k = 0; k < personaggi.length; k++) {
            System.out.println(personaggi[k]);
        }
        
    }

}