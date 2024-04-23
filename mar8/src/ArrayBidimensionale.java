public class ArrayBidimensionale {
    
    public static void main(String[] args) {
        int anni = 5, trimestri = 4; // dimensioni dell'array 2D
        double[][] vendite = new double[anni][trimestri]; // dichiaro e creo un array bidimensionale di double di dimensione 5x4
        vendite[0][0] = 1000.45; // assegno un valore al 1° trimestre del 1° anno (indici da 0)
        vendite[0][1] = 1499.78; // assegno un valore al 2° trimestre del 1° anno
        vendite[0][2] = 1805.07; // assegno un valore al 3° trimestre del 1° anno
        vendite[1][0] = 1010.88; // assegno un valore al 1° trimestre del 2° anno
        vendite[2][1] = 1234.56; // assegno un valore al 2° trimestre del 3° anno
        vendite[2][3] = 2004.44; // assegno un valore al 4° trimestre del 3° anno
        vendite[3][3] = 2400.99; // assegno un valore al 4° trimestre del 4° anno

        // per stampare i contenuti di un array 2D servono due cicli for annidati
        // si parte da un ciclo per scansionare la prima dimensione dell'array (anni)
        for (int i = 0; i < anni; i++) {
            System.out.println("Vendite per trimestre dell'anno " + (i + 2020) + ":");

            for (int j = 0; j < trimestri; j++) {
                System.out.println((j + 1) + "° trimestre: " + vendite[i][j]);
            }

            System.out.println(); // rigo vuoto per stampare con maggiore ordine
        }

    }
    
}