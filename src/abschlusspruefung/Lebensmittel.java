package abschlusspruefung;

public class Lebensmittel extends Produkte {
    private boolean kuehlungnotwendig;

    public Lebensmittel(String artikelId, String bezeichnung, double einkaufspreis, boolean kuehlungnotwendig) {
        super(artikelId, bezeichnung, einkaufspreis);
        this.kuehlungnotwendig = kuehlungnotwendig;
    }

    @Override
    public void drucken() {
        super.drucken();
        if (kuehlungnotwendig){
            System.out.println("Kühlung notwendig: Ja");
        } else{
            System.out.println("Kühlung notwendig: Nein");
        }
        System.out.println("--------------------------");
    }
}
