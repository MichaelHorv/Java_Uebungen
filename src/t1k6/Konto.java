package t1k6;

public class Konto {
    private String inhaberName;
    private double guthaben;
    private double ueberziehungsRahmen;

    public Konto(String inhaberName, double guthaben, double ueberziehungsRahmen) {
        this.inhaberName = inhaberName;
        this.guthaben = guthaben;
        this.ueberziehungsRahmen = ueberziehungsRahmen;
    }

    public void einzahlung(double a) {
        guthaben += a;
    }

    public void auszahlung(double a) {
        if (guthaben + ueberziehungsRahmen < a) {
            System.out.println("Auszahlung nicht möglich!");
        } else {
            guthaben -= a;
        }
    }
    public void drucken(){
        System.out.format("Aktueller Kontostand von %s beträgt %.2f€\n",inhaberName,guthaben);
    }
}
