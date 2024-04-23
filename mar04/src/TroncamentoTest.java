public class TroncamentoTest {
    
    // questo esempio dimostra che programmazione e matematica non vanno d'accordo
    public static void main(String[] args) {
        int num1 = 70, num2 = 80;
        byte num3 = (byte)(num1 + num2); // qui produco un assurdo matematico
        System.out.println(num3);
        int num4 = 20, num5 = 30;
        byte num6 = (byte)(num4 + num5); // qui ok perché resto nel range del tipo byte
        System.out.println(num6);
    }

}