package t1h0;

public class Sattelschlepper extends LKW {
    private double volumenLaderaum;

    public Sattelschlepper(int baujahr,String hersteller, double volumenLaderaum) {
        super(baujahr, hersteller);
        this.volumenLaderaum = volumenLaderaum;
    }
    @Override
    public void drucken() {
        System.out.println("Laderraumvolumen: " + volumenLaderaum);
    }
}
