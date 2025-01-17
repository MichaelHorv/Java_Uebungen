package t1h5;

public class Cabrio extends Passagiertransportwagen{
    private double oeffnungszeitVerdeck;

    public Cabrio(String modellname, int leistung, int baujahr, int anzahlPassagiere, double oeffnungszeitVerdeck) {
        super(modellname, leistung, baujahr, anzahlPassagiere);
        this.oeffnungszeitVerdeck = oeffnungszeitVerdeck;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Öffnungszeit verdeck:" + oeffnungszeitVerdeck);
    }
}
