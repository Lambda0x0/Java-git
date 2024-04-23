public class Clock {

  int currentTime;//dichiaro la variabile currentTime 

  public Clock(int time) { //dichiaro il costruttore con che accetta il parametro time che è di tipo int (quindi numeri non decimali)
    currentTime = time; // assegno il valore del parametro time alla variabile currentTime
  }

  public void displayPartOfDay() { //creo metodo per stampare la parte del giorno in base all'orario (currentTime)


       if (currentTime >= 600 && currentTime <= 1159 && currentTime%100 < 60) {  // se l'orario è compreso tra 600 e 1159 
       // inoltre ho aggiunto l'operatore modulo (%) per controllare se i minuti sono inferiori a 60
      System.out.println("Mattina"); //stampa "Mattina"
      
    } else if (currentTime >= 1200 && currentTime <= 1759 && currentTime%100 < 60) {   // se l'orario è compreso tra 1200 e 1759
      System.out.println("Pomeriggio"); //stampa "Pomeriggio"
      
    } else if (currentTime >= 1800 && currentTime <= 2259 && currentTime%100 < 60) { //se l'orario è compreso tra 1800 e 2259
      System.out.println("Sera"); //stampa "Sera"
      
    } else if (currentTime >= 2300 && currentTime <= 2359 && currentTime%100 < 60 || currentTime >= 0 && currentTime <= 559 && currentTime%100 < 60) { //se l'orario è tra le 2300 e 2359 o tra le 0 e 559
      System.out.println("Notte"); //stampa "Notte" 
      
    } else { // in tutti gli altri casi 
      System.out.println("Orario non valido"); //stampa "Orario non valido"
    }

  }

}
