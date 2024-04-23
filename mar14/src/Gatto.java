public class Gatto extends Pet{
    //classe che rappresena lo scaffale dei prodotti per il gatto
    String[]prodotti = {"1. Cibo secco 5kg", "2. Cibo secco 1kg", "3. cibo umido 500gr", "4. Cibo umido 80gr",
            "5. Fronline gatto 3 pipette", "6. Ciotola", "7. Tiragraffi", "8. Spazzola", "9. Cesta" };
            double[] prezzi = { 30.00, 6.50, 4.50, 0.80, 19.00, 3.00, 8.00, 6.00, 12.00 };// array dei prezzi in ordine riferito

            public double mostraProdotti() { // worker del main()
                System.out.println("*********** Articoli per il G A T T O ***********");
        
                for (int i = 0; i < prodotti.length; i++) {
                    System.out.println(prodotti[i] + ":" + prezzi[i] + "euro/cad");
                }
                System.out.println();
                double totale = cassa(prodotti, prezzi);
                return totale;
        
            }
}