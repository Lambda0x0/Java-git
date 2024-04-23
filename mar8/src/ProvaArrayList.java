import java.util.ArrayList; // import necessario perché ArrayList non è una classe di java.lang

public class ProvaArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> miaLista; // dichiaro un ArrayList di String; uso <> perché ArrayList è una classe parametrica
        miaLista = new ArrayList<>(); // creo l'ArrayList, inizialmente vuoto, dimensione 0

        // inserisco oggetti String nell'ArrayList
        miaLista.add("Andrei");
        miaLista.add("Elisabetta");
        miaLista.add("Michele");
        miaLista.add("Simo");
        miaLista.add("Carlo");
        miaLista.add("Elisabetta");
        miaLista.add("Fabiana");
        miaLista.add("Ferdinando");

        // manipolo l'ArrayList
        System.out.println("miaLista contiene " + miaLista.size() + " elementi"); // size(): dimensione dell'ArrayList al momento della chiamata
        miaLista.remove(0); // rimuovo dall'ArrayList il primo elemento; rimozione per indice
        miaLista.remove("Elisabetta"); // rimuovo il primo oggetto "Elisabetta" dell'ArrayList; rimozione per riferimento
        miaLista.remove(miaLista.size()-1); // rimuovo l'ultimo elemento; rimozione per indice ricordando che gli indici partono da 0
        miaLista.add(1, "Andrei"); // rimetto al secondo posto il primo elemento che era stato rimosso
        System.out.println("Dopo le manipolazioni, Simo occupa l'indice " + miaLista.indexOf("Simo")); // indexOf() fornisce l'indice dell'elemento richiesto

        // stampa di un ArrayList
        for (int i = 0; i < miaLista.size(); i++) { // size() è la dimensione di miaLista in questo momento
            System.out.println(miaLista.get(i));
        }

    }

}