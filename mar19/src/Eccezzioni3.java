public class Eccezzioni3 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128,256,512}; //array di lunghezze diverse
        int denom[] = {2,0,4,4,0,8};


        //soluzione con try/catch annidati
        try{ // outer try
           for (int i = 0; i < numer.length; i++) {
              try { //inner try
                 System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
              } catch (ArithmeticException exc) {  
                 System.out.println("non puoi dividere  " + numer[i] + " per zero");
              }
        }  //per i =6, denom[6] non esiste, il catch di riga 15 non è efficace 
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("denominatore non presente! programma terminato");
    }
}
}