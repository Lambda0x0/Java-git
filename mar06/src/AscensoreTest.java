public class AscensoreTest {
    
    public static void main(String[] args) {
        // Ascensore mioAscensore = new Ascensore();
        // IfElseAscensore mioAscensore = new IfElseAscensore();
        NestedIfElseAscensore mioAscensore = new NestedIfElseAscensore();
        mioAscensore.apriPorta();
        mioAscensore.chiudiPorta();
        mioAscensore.vaiGiu();
        mioAscensore.vaiSu();
        mioAscensore.vaiSu();
        mioAscensore.vaiSu();
        mioAscensore.apriPorta();
        mioAscensore.chiudiPorta();
        mioAscensore.vaiGiu();
        mioAscensore.apriPorta();
        mioAscensore.vaiSu();
        mioAscensore.apriPorta();
    }

}