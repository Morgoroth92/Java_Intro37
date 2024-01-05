public class Rettangolo extends Forma{

        Formine rettangolo = Formine.RETTANGOLO;
        @Override
        void calcolaArea() {
            System.out.println("Area rettangolo: " + (rettangolo.lato1 * rettangolo.lato2));
        }
}
