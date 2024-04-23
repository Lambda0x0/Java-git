public class ToStringTest {
    
    public static void main(String[] args) {
        System.out.println(new Object()); // println() stampa String, per cui verrà svolto il toString() implicitamente
        System.out.println(new StringBuilder("Un testo")); // toString() automatico perché nel println() devono esserci String
        System.out.println(new First()); // istanza anonima di First
        System.out.println(new Second()); // istanza anonima di Second: println() invoca il toString() dovendo restituire una String ma trova l'override di Second
    }

}

class First {}

class Second {
    String seconda = "Questa classe fa un override di toString()";

    public String toString() {
        return seconda;
    }

}