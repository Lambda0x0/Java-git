public class ConversioneString {
    
    public static void main(String[] args) {
        String stringaUno = "2"; // simulo l'immissione di "2" in args[0]
        String stringaDue = "5"; // simulo l'immissione di "5" in args[1]
        System.out.println("Concatenazione: " + stringaUno + stringaDue);
        int numeroUno = Integer.parseInt(stringaUno); // parseInt() ricava il valore numerico della String in parentesi, è un metodo della classe wrapper Integer che gestisce il tipo int
        byte numeroDue = Byte.parseByte(stringaDue); // idem per l'altra String
        System.out.println("Somma: " + (numeroUno + numeroDue)); // se non metto le parentesi, il secondo + viene letto come concatenazione perché il primo + ha a sinistra una String
    }

}