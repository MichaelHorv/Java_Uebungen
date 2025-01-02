package t1h9;

public class Waehrungskonto extends Bankkonto{
    private char waehrung;

    public Waehrungskonto(String kontoinhaber, double saldo, double habenzinsen, char waehrung){
        super(kontoinhaber, saldo, habenzinsen);
        this.waehrung = waehrung;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Währung: " + waehrung);
        System.out.println("----------------------------------");
    }
}
