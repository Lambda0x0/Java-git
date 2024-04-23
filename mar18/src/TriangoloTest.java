public class TriangoloTest {
    
    public static void main(String[] args) {
        double area = Triangolo.area(16, 9);
        System.out.println("Area del 1° triangolo: " + area);
        area = Triangolo.area(14, 10, 0.754);
        System.out.println("Area del 2° triangolo: " + area);
        area = Triangolo.area(14, 15, 16);
        System.out.println("Area del 3° triangolo: " + area);
    }
    
}