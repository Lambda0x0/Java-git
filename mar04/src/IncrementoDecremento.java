public class IncrementoDecremento {
    
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Pre incremento: " + ++i); // stampo dopo l'incremento (6)
        System.out.println("Post incremento: " + i++); // stampo prima dell'incremento (6)
        System.out.println(i); // per sapere il valore incrementato devo stamparlo dopo (7)
    }

}