package pruefung;

public class Flug {
    private String von;
    private String nach;
    private double basisPreis;
    private boolean firstClass;
    private boolean verpflegung;
    private int anzahlGepaeck;

    public Flug(String von, String nach, double basisPreis, boolean firstClass, boolean verpflegung) {
        this.von = von;
        this.nach = nach;
        this.basisPreis = basisPreis;
        this.firstClass = firstClass;
        this.verpflegung = verpflegung;
    }

    public void setAnzahlGepaeck(int anzahlGepaeck) {
        this.anzahlGepaeck = anzahlGepaeck;
    }

    public double berechnePreis() {
        double summe = basisPreis;
        if (firstClass) {
            summe *= 1.5;
        }
        if (verpflegung) {
            summe += 15;
        }
        summe += (anzahlGepaeck * 21);
        return summe;
    }

    public void drucken() {
        double summe = berechnePreis();
        if (firstClass && verpflegung) {
            System.out.format("Der Flug von %s nach %s, inkl. first Class und inkl. Verpflegung, mit %d Stück Koffer kostet %.2f€.", von, nach, anzahlGepaeck, summe);
        } else if (firstClass) {
            System.out.format("Der Flug von %s nach %s, inkl. first Class und exkl. Verpflegung, mit %d Stück Koffer kostet %.2f€.", von, nach, anzahlGepaeck, summe);
        } else if (verpflegung) {
            System.out.format("Der Flug von %s nach %s, exkl. first Class und inkl. Verpflegung, mit %d Stück Koffer kostet %.2f€.", von, nach, anzahlGepaeck, summe);
        } else {
            System.out.format("Der Flug von %s nach %s, exkl. first Class und excl. Verpflegung, mit %d Stück Koffer kostet %.2f€.", von, nach, anzahlGepaeck, summe);
        }
    }
}