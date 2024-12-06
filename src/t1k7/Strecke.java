package t1k7;

public class Strecke {
    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    public double berechneLeange() {
        return Math.sqrt(Math.pow((p.getX()) - q.getX(), 2) + Math.pow((p.getY()) - q.getY(), 2));
    }
}
