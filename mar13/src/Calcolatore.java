public class Calcolatore {
    
    public static int somma(int numeroUno, int numeroDue) {
        System.out.println("Metodo 1");
        return numeroUno + numeroDue;
    }

    // metodo in overloading col precedente: stesso nome ma firma (argomenti) differente
    public static float somma(float numeroUno, float numeroDue) {
        System.out.println("Metodo 2");
        return numeroUno + numeroDue;
    }

    // metodo in overloading con i precedenti: stesso nome ma firma (argomenti) differente
    public static float somma(int numeroUno, float numeroDue) {
        System.out.println("Metodo 3");
        return numeroUno + numeroDue;
    }

    // metodo in overloading con i precedenti: stesso nome ma firma (argomenti) differente
    public static float somma(float numeroUno, int numeroDue) {
        System.out.println("Metodo 4");
        return numeroUno + numeroDue;
    }

    // metodo in overloading con i precedenti: stesso nome ma firma (argomenti) differente
    public static int somma() {
        System.out.println("Metodo 5");
        return 3 + 3;
    }

}