public class CicloForString {
    

    public static void main(String[] args) {
        for(String i = "|", t ="-------"; i.length() <7; i += "|", t= t.substring(1)){
            System.out.println(i+t);
        }
    }
}
