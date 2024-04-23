public class ByteTest {
    
    public static void main(String[] args) {
        byte b1 = 1, b2 = 2, b3; // dichiaro tre variabili byte, ne inizializzo due
        // b3 = b1 + b2; operazione scorretta perché b1 + b2 viene svolta in int, e Java non permette una possibile perdita di precisione salvando in byte
        b3 = (byte)(b1 + b2); // effettuando il casting al tipo byte, converto il risultato della somma svolta da Java in int, nel tipo di variabile desiderato
        int b4 = b1 + b2; // oppure sapendo che Java converte in int, salvo il risultato in una variabile di tipo int
        System.out.println("b3 = " + b3 + "; b4 = " + b4);
    }
    
}