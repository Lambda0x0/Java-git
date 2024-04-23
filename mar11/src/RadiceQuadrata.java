public class RadiceQuadrata {
    // programma che ricava la radice quadrata di un numero senza usare la funzione Math.sqrt()

    public static void main(String[] args) {
        double radice = 872; // numero di cui voglio trovare la radice quadrata
        double radiceQuadrata = radice; //valore iniziale della variabile su cui fare i tentativi


        //verifico accuratezza
        while (radiceQuadrata*radiceQuadrata- radice > 0.001) {
            //entro nel ciclo se il valore ottenuto,al quadrado, è più lotto di 0.001 del valore immesso 
            radiceQuadrata = (radiceQuadrata + radice/radiceQuadrata)/2; //formula di convergenza
            System.out.println("prossimo tentativo con  " + radiceQuadrata);

            
        }

        System.out.println("La radice quadrata di " + radice + " è " + radiceQuadrata +" con una accuratezza di 0.001");

    }
}
