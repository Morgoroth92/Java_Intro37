public class Trinagolo extends Forma{
    Formine triangolo = Formine.TRIANGOLO;
    @Override
    void calcolaArea() {
        System.out.println("Area triangolo: " + (triangolo.lato1 * triangolo.lato2) / 2);
    }
}
