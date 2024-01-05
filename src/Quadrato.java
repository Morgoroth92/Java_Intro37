public class Quadrato extends Forma{

    Formine quadrato = Formine.QUADRATO;
    @Override
    void calcolaArea() {
        System.out.println("Area quadrato: " + (quadrato.lato1 * quadrato.lato2));
    }
}
