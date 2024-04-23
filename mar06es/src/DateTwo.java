public class DateTwo { //dichiaro la classe
    public int numeroGiorno; //dichiaro la variabile numeroGiorno int(perchè intera)

    
   public void displayDay() { //creo il metodo displayDay con all'interno uno switch basato sul valore numeroGiorno
       switch (numeroGiorno) {
       case  1:
           System.out.println( "è lunedì");
           break;
       case 2:
           System.out.println("è martedì");
           break;
       case 3:
           System.out.println("è mercoledì");
           break;
       case 4:
           System.out.println("è giovedì");
           break;
       case 5:
           System.out.println("è venerdì");
           break;
       case 6:
           System.out.println("è sabato");
           break;
       case 7:
           System.out.println("è domenica");
           break;
            default:
           System.out.println("numero giorno non valido");
       } 
   }
    }
   
   