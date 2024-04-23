public class ContoBancario {
  
   public double saldo;

  public ContoBancario(double saldoIniziale) {
    saldo = saldoIniziale;
  }

  public void versa(double importo) {
    saldo += importo;
  }

  public void preleva(double importo) {
    saldo -= importo;
  }

  public void calcolaInteressi(double tasso) {
    saldo += saldo * tasso / 100; 
  }

  public double getSaldo() {
    return saldo;
  }

}




