package t1h3;

public class Pferd extends Nutztier{
    private double zuglast;

    public Pferd(String name, String fellfarbe, int alter, double zuglast) {
        super(name, fellfarbe, alter);
        this.zuglast = zuglast;
    }

    @Override
    public void gibLaut() {
        super.gibLaut();
        System.out.println("Jjjiiiihhhaaaa");
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Zuglast: " + zuglast + "kN");
        System.out.println("-------------------------");
    }
}
