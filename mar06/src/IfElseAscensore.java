public class IfElseAscensore {
    public boolean portaAperta = false; // la porta parte chiusa per sicurezza
    public int pianoCorrente; // piano zero corrisponde al piano terra
    public final int PIANO_MIN = 0; // non devo poter scendere sotto al piano minimo
    public final int PIANO_MAX = 5; // non devo poter salire sopra al piano massimo

    public void apriPorta() {
        System.out.println("Sto aprendo la porta");
        portaAperta = true;
        System.out.println("La porta è aperta");
    }

    public void chiudiPorta() {
        System.out.println("Sto chiudendo la porta");
        portaAperta = false;
        System.out.println("La porta è chiusa");
    }

    public void vaiSu() {

        if (pianoCorrente == PIANO_MAX) { // se sono già in cima al palazzo
            System.out.println("Non posso salire!");
        } else {
            System.out.println("Sto salendo di un piano");
            pianoCorrente++;
            System.out.println("Piano: " + pianoCorrente);
        }

    }

    public void vaiGiu() {

        if (pianoCorrente == PIANO_MIN) { // se sono già a piano terra
            System.out.println("Non posso scendere!");
        } else {
            System.out.println("Sto scendendo di un piano");
            pianoCorrente--;
            System.out.println("Piano: " + pianoCorrente);
        }

    }

}