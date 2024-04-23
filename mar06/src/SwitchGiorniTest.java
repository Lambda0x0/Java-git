public class SwitchGiorniTest {
    
    public static void main(String[] args) {
        SwitchGiorni mioSwitch = new SwitchGiorni();
        mioSwitch.mese = 3;
        mioSwitch.calcolaGiorni();
        mioSwitch.mese = 11;
        mioSwitch.calcolaGiorni();
        mioSwitch.mese = -74;
        mioSwitch.calcolaGiorni();
    }
    
}