package t1h9;

public abstract class Bankkonto {
    protected String kontoinhaber;
    protected double saldo;
    protected double habenzinsen;

    public Bankkonto(String kontoinhaber, double saldo, double habenzinsen) {
        this.kontoinhaber = kontoinhaber;
        this.saldo = saldo;
        this.habenzinsen = habenzinsen;
    }

    public void drucken() {
        System.out.println("----------------------------------");
        System.out.println("Kontotyp: " + getClass().getSimpleName());
        System.out.println("Kontoinhaber: " + kontoinhaber);
        System.out.println("Saldo: " + saldo);
        System.out.println("Habenzinsen: " + habenzinsen);
    }
}
