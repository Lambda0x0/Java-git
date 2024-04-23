
public class Cane extends Pet{
    // classe che rappresenta lo scaffale dei prodotti per il cane
    String[] prodotti = {"1. Cibo secco 5kg", "2. Cibo secco 1kg", "3. cibo umido 500gr", "4. Cibo umido 80gr",
            "5. Fronline cane 4 pipette", "6. Ciotola", "7. dentastix", "8. Guinzaglio con collare", "9. Cuccia" };
    double[] prezzi = { 33.00, 7.50, 4.00, 1.00, 18.50, 3.00, 4.00, 8.00, 99.00 };// array dei prezzi in ordine riferito
                                                                                  // ai prodotti nell'altro array

    public double mostraProdotti() { // worker del main()
        System.out.println("*********** Articoli per il C A N E ***********");

        for (int i = 0; i < prodotti.length; i++) {
            System.out.println(prodotti[i] + ":" + prezzi[i] + "euro/cad");
        }
        System.out.println();
        double totale = cassa(prodotti, prezzi);
        return totale;
}

}