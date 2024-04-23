// posso scrivere più classi nello stesso file purché l'unica public sia quella che dà il nome al file

class Madre {

    public int metodo(int i, int j) {
        return i + j;
    }

}

class Figlia extends Madre {

    // in override il metodo deve avere la stessa firma dell'omonimo in superclasse
    public int metodo(int i, int j) {
        return i - j;
    }

    public int metodoBis(int i, int j) {
        return i * j;
    }

}

public class OverrideTest {
    
    public static void main(String[] args) {
        Madre a = new Madre();
        Figlia b = new Figlia();
        Madre c = new Figlia(); // oggetto Figlia riferito alla superclasse Madre
        System.out.println(a.metodo(5, 7)); // svolto metodo() di superclasse
        System.out.println(b.metodo(5, 7)); // svolto metodo() di sottoclasse
        System.out.println(c.metodo(5, 7)); // svolto metodo() di sottoclasse perché l'override "vince" sul riferimento alla supeclasse
        System.out.println(b.metodoBis(5, 7));
        // System.out.println(c.metodoBis(5, 7)); non consentito, non esiste in superclasse
    }

}