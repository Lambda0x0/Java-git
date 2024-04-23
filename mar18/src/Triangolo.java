public class Triangolo {

    // formula classica: base*altezza/2
    public static double area(int base, int altezza) {
        return base*altezza/2;
    }

    // formula di Carnot
    public static double area(int a, int b, double gamma) {
        return 0.5*a*b*Math.sin(gamma);
    }

    // formula di Erone o del semiperimetro
    public static double area(int a, int b, int c) {
        double p = (a + b + c)/2.0; // semiperimetro necessario nella formula
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
}