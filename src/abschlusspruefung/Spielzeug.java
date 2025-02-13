package abschlusspruefung;

public class Spielzeug extends Produkte {
    private int mindestalter;

    public Spielzeug(String artikelId, String bezeichnung, double einkaufspreis, int mindestalter) {
        super(artikelId, bezeichnung, einkaufspreis);
        this.mindestalter = mindestalter;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Mindestalter: " + mindestalter);
        System.out.println("--------------------------");

    }
}
