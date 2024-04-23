import java.util.Scanner;

public class CamiciaTest {
    
    public static void main(String[] args) {
        Camicia miaCamicia = new Camicia();
        Scanner inputNumeri = new Scanner(System.in);
        Scanner inputTesti = new Scanner(System.in);

        System.out.println("Inserisci l'ID della camicia (positiva e di 4 cifre)");
        miaCamicia.setCamiciaID(inputNumeri.nextInt());

        System.out.println("Inserisci la descrizione (almeno 8 caratteri)");
        miaCamicia.setDescrizione(inputTesti.nextLine());

        System.out.println("Inserisci il codice colore (R = red, B = blue, G = green, W = white)");
        miaCamicia.setCodiceColore(inputTesti.nextLine().toUpperCase().charAt(0));

        System.out.println("Inserisci il prezzo unitario in euro (maggiore di 0 e non superiore a 300)");
        miaCamicia.setPrezzo(inputNumeri.nextDouble());

        System.out.println("Inserisci la quantità disponibile (maggiore di 0)");
        miaCamicia.setDisponibili(inputNumeri.nextInt());

        System.out.println("Inserisci le quantità acquistate (maggiore di 0 e al massimo " + miaCamicia.getDisponibili() + ")");
        miaCamicia.setAcquistate(inputNumeri.nextInt());

        miaCamicia.display();
        inputNumeri.close();
        inputTesti.close();
        System.exit(0);
    }
    
}