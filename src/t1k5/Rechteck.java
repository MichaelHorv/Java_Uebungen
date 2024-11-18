package t1k5;

public class Rechteck {
    private int SeiteA;
    private int SeiteB;

    public Rechteck(int a, int b) {
        SeiteA = a;
        SeiteB = b;
    }

    public int flaeche() {
        return SeiteA*SeiteB;
    }


    public int umfang() {
        return 2 * SeiteA + 2 * SeiteB;
    }


}
