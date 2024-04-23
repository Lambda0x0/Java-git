public class OperatoreTernario {
    
    public static void main(String[] args) {
        int ora = 18;
        String saluto = (ora < 13) ? "Buongiorno!" : "Buonasera";
        /* corrisponde a:
         * if (ora < 13) {
         *  saluto = "Buongiorno";
         * } else {
         *  saluto = "Buonasera";
         * }
         */
        System.out.println(saluto);
        String salutoAvanzato = (ora < 6) ? "Buonanotte" : (ora < 13) ? "Buongiorno" : (ora < 19) ? "Buon pomeriggio" : "Buonasera";
        System.out.println(salutoAvanzato);
        /* corrisponde a:
         * if (ora < 6) {
         *  salutoAvanzato = "Buonanotte";
         * } else if (ora < 13) {
         *  salutoAvanzato = "Buongiorno";
         * } else if (ora < 19) {
         *  salutoAvanzato = "Buon pomeriggio";
         * } else {
         *  salutoAvanzato = "Buonasera";
         * }
         */
    }
}