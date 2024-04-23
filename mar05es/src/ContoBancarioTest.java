
public class ContoBancarioTest {
    public static void main(String[] args) {

        ContoBancario primoConto = new ContoBancario(0);
        primoConto.versa(1000);
       
        primoConto.preleva(500);
        primoConto.preleva(150);
        System.out.println("Saldo primo conto: " + primoConto.getSaldo() + " €;");
        ContoBancario secondoConto = new ContoBancario(1000);
        secondoConto.calcolaInteressi(10);
        System.out.println("Saldo secondo conto: " + secondoConto.getSaldo() + " euro;");

    }
}
