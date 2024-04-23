public class Eccezzioni1{
    public static void main(String[] args) {
        
        int numeri[] = new int[4];// array di int di 4 elementi
        try{ //quello che scrivo nel try è moniterato  dal generarsi di eccezioni
             System.out.println("prima che l'eccezzione sia generata");//istruzione "tranquilla"
             numeri[7] = 10;//provoco un eccezzione, numeri.length = 4...
             System.out.println("questo non verrà stampato");//
        }
        catch (ArrayIndexOutOfBoundsException exc) { //intercetto l'eccezione generata a rigo a 7 
           System.out.println("indice dell'array fuori dai parametri");//gestire l'eccezione

        }

        System.out.println("dopo che il blocco try/catch è stato attraversato");//
    }
}