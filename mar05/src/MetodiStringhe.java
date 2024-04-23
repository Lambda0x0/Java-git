public class MetodiStringhe {

    public static void main(String[] args) {
        String saluto = " COME ".trim(); // trim() toglie eventuali spazi all'inizio e alla fine; trova applicazione nel rimuovere questi spazi negli input utente
        System.out.println(saluto);
        String minuscolo = saluto + " STAI?".toLowerCase(); // toLowerCase() trasforma in minuscolo la String cui è agganciato
        System.out.println(minuscolo);
        String theString = "Hello".concat(" World"); // concat() equivalente al + per concatenare String
        System.out.println(theString);
        String partialString = theString.substring(6); // subString() estrae una porzione di String partendo dalla posizione 6 (primo carattere ha posizione 0); metodo che ha un int come argomento
        System.out.println(partialString);
        boolean terminaCon = theString.endsWith("World"); // verifico se la String theString termina con "World", in tal caso otterrò true, altrimenti false, che salvo in una variabile boolean dedicata. Sintassi del metodo: public boolean endsWith(String s)
        System.out.println(terminaCon);
        terminaCon = theString.endsWith("world"); // cerco la String tutta in minuscolo
        System.out.println(terminaCon);
        System.out.println("La String theString è composta da " + theString.length() + " caratteri"); // length() restituisce il numero di caratteri componenti una String
    }

}