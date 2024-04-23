// implemento due classi che rappresentino il contenuto della bottiglia (i miei parametri)
class Acqua {

    public String toString(){ // toString() metodo delle API di Java che sto sovrascrivendo
        return "una bottiglia di acqua";
    }

}

class Vino {

    public String toString(){
        return "una bottiglia di vino";
    }

}

// implemento la classe di tipo Generics
class Bottiglia<T> { //T: paramentro generico, destinato a diventare Acqua oppure Vino, o altre eventuali classi, come ArrayList<String>, ArrayList<Camicia>, ecc..
    private T contenuto; // contenuto è una variabile di tipo T, parametrica

    public Bottiglia(T t) { // costruttore della classe, t è un'istanza di T
        setContenuto(t);
    }

    //inizio incapsulamento 
    public void setContenuto(T t){
        contenuto = t; // assegno l'istanza di T al private contenuto 
    }

    public T getContenuto(){
        return contenuto;
    }
    // fine incapsulamento
}

// implemento il braccio meccanico
class BraccioMeccanico {

    public void prendiBottiglia(Bottiglia<?> bottiglia){ // ?: il braccio meccanico ignora il contenuto ma Bottiglia è class Generics e va scritta con il tipo in <>
        System.out.println("Ho preso " + bottiglia.getContenuto());

    }
}

public class GenericsTest {
    
    public static void main(String[] args) {
        Bottiglia<Acqua> bottiglia1 = new Bottiglia<Acqua>(new Acqua()); // new Acqua è la t che va nel costruttore
        Bottiglia<Vino> bottiglia2 = new Bottiglia<Vino>(new Vino()); // new Vino () è t che va nel contruttore
        BraccioMeccanico braccio = new BraccioMeccanico();
        braccio.prendiBottiglia(bottiglia1); // bottiglia1 è una bottiglia contenente acqua
        braccio.prendiBottiglia(bottiglia2); // bottiglia1 è una bottiglia contenente vino      } 
}