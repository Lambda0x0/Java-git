public class Eccezzioni2 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128};
        int denom[] = {2,0,4,4,0,8};
        // tento di dividere  ogni elemento  di numer[]per il corrispondente elemento di denom[]
       /*  for (int i= 0; i<numer.length; i++) {
            System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i]);
            
            
            
            
            
        }*/
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) { //intercetto l'eccezione  per gestirla 
                System.out.println("non puoi dividere  " + numer[i] + " per zero");
            }
        }
    }
}
