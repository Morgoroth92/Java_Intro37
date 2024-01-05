public enum Formine {
    QUADRATO(5,5),
    RETTANGOLO(5,10),
    TRIANGOLO(5,9);

    final int lato1;
    final int lato2;
    Formine(int lato1, int lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }
}
