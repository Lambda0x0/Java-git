public class SwitchGiorni {
    public int mese;
    
    public void calcolaGiorni() {

        switch(mese) {
            case 1, 3, 5, 7, 8, 10, 12: // elenco i valori di mese da 31 giorni
                System.out.println("Il mese " + mese + "° ha 31 giorni");
                break; // se ho trovato il mese, esco dallo switch
            case 2:
                System.out.println("Il mese " + mese + "° ha 28 o 29 giorni");
                break;
            case 4, 6, 9, 11: // elenco i valori di mese da 30 giorni
                System.out.println("Il mese " + mese + "° ha 30 giorni");
                break;
            default: // per immissioni errate, analogo all'else finale di un if/else
                System.out.println("Il mese " + mese + " non esiste!");
        }
           
    }

}
