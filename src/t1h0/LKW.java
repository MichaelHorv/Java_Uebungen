package t1h0;

public class LKW {
    private int baujahr;
    private String hersteller;

    public LKW(int baujahr, String hersteller) {
        this.baujahr = baujahr;
        this.hersteller = hersteller;
    }

    public void drucken() {
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Hersteller: " + hersteller);
    }

}

