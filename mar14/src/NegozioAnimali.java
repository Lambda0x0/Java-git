import java.util.Scanner;

public class NegozioAnimali {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totaleComplessivo = 0.0;//variabile che si aggiornerà con la spesa fatta
        boolean ancora = true;//boolean per effettuare piu acquisti su cane e gatto
        double totaleCane = 0.0, totaleGatto = 0.0;
        char altri = ' '; //memorizzo la scelta se acquistare ancora 

        do {
            System.out.println("Vuoi acquisare per un cane (digita C) o per un gatto (digita G)? ");

            switch (input.nextLine().toUpperCase().charAt(0)) {
              //posso farlo perche charart mi restituisce un char che puo essere gesito nello switch
              case 'C':
                 Cane mioCane = new Cane();
                 totaleCane = mioCane.mostraProdotti();
                 totaleComplessivo += totaleCane;
                 break;

                 case 'G':
                 Gatto mioGatto = new Gatto();
                 totaleGatto = mioGatto.mostraProdotti();
                 totaleComplessivo += totaleGatto;
                 break;

                 default:
                 System.out.println("Codice digitato errato!");
            }
            System.out.println("desideri effettuare altri acquisti? (S/N)");
            altri = input.nextLine().toUpperCase().charAt(0);

            if (altri != 'S'){
                ancora = false;
             }

        } while (ancora);

         input.close();

        System.out.println();
        System.out.println("********* Scontrino fiscale *********");
        System.out.println("Totale da pagare: " + totaleComplessivo + "euro");
        System.out.println("Grazie, arrivederci!");
        System.exit(0);
    }
}
