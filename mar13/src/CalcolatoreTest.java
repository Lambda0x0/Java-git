public class CalcolatoreTest {
    
    public static void main(String[] args) {
        int somma1 = Calcolatore.somma(5, 7);
        System.out.println("La somma è " + somma1);

        float somma2 = Calcolatore.somma(5.47F, 7.38F);
        System.out.println("La somma è " + somma2);

        somma2 = Calcolatore.somma(5, 12.3F);
        System.out.println("La somma è " + somma2);

        somma2 = Calcolatore.somma(12.35F, 7);
        System.out.println("La somma è " + somma2);

        somma1 = Calcolatore.somma();
        System.out.println("La somma è " + somma1);
    }

}