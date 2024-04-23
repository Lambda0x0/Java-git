public class Cameriere {
    
    // worker del main()
    public void comanda(String ord1, String ord2, String ord3, String bev) {
        System.out.println("Yuri porta " + bev + " al tavolo");
        System.out.println("Yuri chiede al pizzaiolo Gianmarco di preparare " + ord1 + ", " + ord2 + ", " + ord3);

        Pizzaiolo Gianmarco = new Pizzaiolo();
        Gianmarco.cucina(ord1, ord2, ord3); // il caller comanda() invoca il worker cucina()

        System.out.println("Yuri consegna " + ord1 + ", " + ord2 + ", " + ord3 + " al tavolo e augura buon appetito");
    }
    // metodo terminato, il controllo del programma torna al caller

}