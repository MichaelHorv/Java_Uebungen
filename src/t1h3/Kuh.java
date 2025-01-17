package t1h3;

public class Kuh extends Nutztier{
    private double milchertrag;

    public Kuh(String name, String fellfarbe, int alter, double milchertrag) {
        super(name, fellfarbe, alter);
        this.milchertrag = milchertrag;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Milchertrag: " + milchertrag);
        System.out.println("-------------------------");
    }

    public double getMilchertrag() {
        return milchertrag;
    }

    @Override
    public void gibLaut() {
        super.gibLaut();
        System.out.println("Muuuuuhhhhh");
    }
}
