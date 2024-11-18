package t1l4;

public class BankKonto {
    private double kontostand;
    private double ueberziehungsrahmen;

    public BankKonto(double kontostand, double ueberziehungsrahmen) {
        this.kontostand = kontostand;
        this.ueberziehungsrahmen = ueberziehungsrahmen;
    }

    public boolean abheben(double a) {
        if (a <= kontostand + ueberziehungsrahmen) {
            kontostand -= a;
            return true;
        } else {
            return false;
        }
    }

    public void einzahlen(double a) {
        kontostand += a;
    }

    public double getKontostand() {
        return kontostand;
    }
}
