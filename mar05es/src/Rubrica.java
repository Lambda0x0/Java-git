public class Rubrica {

  StringBuilder nome;

  StringBuilder numero;

  public Rubrica() {
    nome = new StringBuilder(8); 
    numero = new StringBuilder();
  }

  public void mostraInfo() {

    nome.append("Luciano Lamberti");
    
    System.out.println(nome);

    if(nome.capacity() > 8) {
      System.out.println("NOME TROPPO LUNGO");
    }

    numero.append("3334545654");
    
    numero.insert(3, "-");
    numero.insert(7, "-");

    System.out.println(numero);

  }

}
