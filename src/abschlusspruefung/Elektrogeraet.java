package abschlusspruefung;

public class Elektrogeraet extends Produkte{
    private char energieeffizienz;

    public Elektrogeraet(String artikelId, String bezeichnung, double einkaufspreis, char energieeffizienz) {
        super(artikelId, bezeichnung, einkaufspreis);
        this.energieeffizienz = energieeffizienz;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Energieeffizienzklasse: " +energieeffizienz);
        System.out.println("--------------------------");
    }
}
