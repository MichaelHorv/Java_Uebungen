package t1k5;

public class Rechteck {
    private int SeiteA;
    private int SeiteB;

    public Rechteck(int seiteA, int seiteB) {
        SeiteA = seiteA;
        SeiteB = seiteB;
    }

    public int flaeche() {
        return SeiteA*SeiteB;
    }


    public int umfang() {
        return 2 * SeiteA + 2 * SeiteB;
    }


}
