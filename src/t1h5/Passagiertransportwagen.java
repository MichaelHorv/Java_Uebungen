package t1h5;

public abstract class Passagiertransportwagen extends Kraftfahrzeug {
    private int anzahlPassagiere;

    public Passagiertransportwagen(String modellname, int leistung, int baujahr, int anzahlPassagiere) {
        super(modellname, leistung, baujahr);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Anzahl an Passagieren:" + anzahlPassagiere);
    }
}
