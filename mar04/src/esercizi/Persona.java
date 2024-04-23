package esercizi;
public class Persona{
    int eta = 0;
    int giorni = 0;
    int secondi = 0;
    public Persona(int eta) {
        this.eta = eta;
        giorni = eta * 365;
        secondi = giorni * 86400;
    }

public void calcolaEta(){
    System.out.println("lamia eta è " + eta + " anni, che corrisponde a:");
    System.out.println(giorni + " giorni");
    System.out.println(secondi + " secondi");
}
}