import java.util.Scanner;

public class CamiciaCTest {
    
    public static void main(String[] args) {
        // creazione di una camicia con costruttore personalizzato che invia le caratteristiche da inizializzare
        Scanner input = new Scanner(System.in);
        int id = 1234; // valore che voglio assegnare a camiciaID
        String de = "Modello sportivo"; // valore che voglio assegnare a descrizione
        char cc = 'R'; // valore che voglio assegnare a codiceColore
        double pr = 44.55; // valore che voglio assegnare a prezzo
        char st = 'S'; // valore che voglio assegnare a stile
        System.out.print("La camicia è personalizzata? (S/N): ");

        if (input.nextLine().equals("N")) { // se non è personalizzata, il cliente può restituirla
            System.out.print("Entro quanti giorni va restituita? (da 1 a 15): ");
            int giorni = input.nextInt();
            Camicia miaCamicia = new Camicia(id, de, cc, pr, st, giorni);
            miaCamicia.display();
        } else {
            System.out.println("Programma non ancora completato per gestire camicie personalizzate"); // va creata una CamiciaPersonalizzata.java priva dell'implements Restituibile e quindi istanziata quella...
        }

        input.close();
        System.exit(0);        
    }

}