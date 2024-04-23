public class RaddoppioCapitale {
    //  programma che calcola gli anni necessari per raddoppiare un capitale dato un tasso di interesse





    public static void main(String[] args) {
        double capitaleIniziale = 12000; // capitale iniziale
        double tasso = 2.5;
        int anni = 2024;// variabile che fornirà l'output del programma
        double capitaleAttuale = capitaleIniziale; // variabile da usare nei tentativi

        while (capitaleAttuale <= capitaleIniziale*2) {
            capitaleAttuale += capitaleAttuale * tasso/100; //applico l'interessa di un anno
            anni++; //applicando l'interessa  trascorre un anno
            System.out.println("Anno " +anni +": " +(int)capitaleAttuale +" euro");
        }
    }
}
