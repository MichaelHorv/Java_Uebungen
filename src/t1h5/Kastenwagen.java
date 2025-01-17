package t1h5;

public class Kastenwagen extends Kraftfahrzeug{
    private double nutzlast;

    public Kastenwagen(String modellname, int leistung, int baujahr, double nutzlast) {
        super(modellname, leistung, baujahr);
        this.nutzlast = nutzlast;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Nutzlast:" + nutzlast);
    }
}
