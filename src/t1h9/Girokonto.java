package t1h9;

public class Girokonto extends Bankkonto {
    private double sollzinsen;
    private double ueberziehungsrahmen;

    public Girokonto(String kontoinhaber, double saldo, double habenzinsen, double sollzinsen, double ueberziehungsrahmen) {
        super(kontoinhaber, saldo, habenzinsen);
        this.sollzinsen = sollzinsen;
        this.ueberziehungsrahmen = ueberziehungsrahmen;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Sollzinsen: " + sollzinsen);
        System.out.println("Ueberziehungsrahmen: " + ueberziehungsrahmen);
        System.out.println("----------------------------------");
    }
}
