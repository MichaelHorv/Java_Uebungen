package t1a11;

public class RechnungZeile {
    private int anzahl;
    private Ware ware;


    public RechnungZeile(int anzahl, Ware ware) {
        this.anzahl = anzahl;
        this.ware = ware;
    }

    public double berechneZeilenPreis() {
        return ware.getPreis() * anzahl;
    }

    public void drucken() {
        System.out.format("%s \t %s \t%.2f€\t\t %.2f€\n", anzahl, ware.getArtikelBezeichnung(), ware.getPreis(), berechneZeilenPreis());
    }
}
