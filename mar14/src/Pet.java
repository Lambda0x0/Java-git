import java.util.ArrayList;
import java.util.Scanner;

public class Pet {// superclasse

    public double cassa(String[] prod, double[] prez){
        boolean ancora = true;//boolean per acquisti multipli sullo stesso animale(entrero in cassa ( entre sono in mostraProdotti () di cane o gatto) 
        double totaleParziale = 0.0;
        double totale = 0.0;
        int codice, quanti;
        char altri = ' '; //memorizzo la scelta se acquistare ancora sullo specifico scaffale
        Scanner input = new Scanner(System.in);
        ArrayList<String> Carrello = new ArrayList<>();//qui immagazzinero gli articoli acquistati

    //in questo momento vede lo scaffale del cane o del gatto
    do {
        System.out.print("DIgitale il codice del prodotto desiderato: ");
        codice = input.nextInt()-1;


        switch (codice) {//sottraggo 1 per allineare il codice con la posizione nell'array
            case 0, 1, 2, 3, 4, 5, 6, 7, 8://elenco gli indici che accetto
            System.out.print("Digitale la quantià di " + prod[codice].substring(3) + "desiderati");//tolgo l'indice(numeretto)dal nome del prodotto
            quanti = input.nextInt();
            //noto il prodotto tramite il codice e la quantità , posso calcolare il prodotto
            totaleParziale += prez[codice] * quanti;
            totale += totaleParziale;//equivale a totale =  totale + totaleParziale
            Carrello.add("Prodotto: " + prod[codice].substring(3) + " | Quantità: " + quanti + "| Prezzo: " +  totaleParziale + "euro");
            input.nextLine();//processo di invio precedente su nexint()
            System.out.println("Desideri altri prodotti da questo scaffale ? (S/N)");
            altri = input.nextLine().toUpperCase().charAt(0);//salvo la scelta dell'utente
            break;
            default:
            System.out.println("Codice digitato errato");
            input.close();
         }

         if (altri != 'S'){
            ancora = false;
         }
       } while (ancora);
       System.out.println();

       System.out.println("********* Articoli nel carrello **********");

       for(String lettore : Carrello){
        System.out.println(lettore);
    }

    return totale;

}

}