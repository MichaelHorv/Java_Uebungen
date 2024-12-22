package t1h7;

public class Unternehmen {
    private int anzahlmaxMitarbeiter = 30;
    private String unternehmensName = "ITSec";

    Mitarbeiter[] unternehmen = new Mitarbeiter[anzahlmaxMitarbeiter];

    public boolean mitarbeiterAufnehmen(Mitarbeiter m) {
        for (int i = 0; i < unternehmen.length; i++) {
            if (unternehmen[i] == null) {
                unternehmen[i] = m;
                return true;
            }
        }
        return false;
    }

    public boolean mitarbeiterKuendigen(int pnr) {
        for (int i = 0; i < unternehmen.length; i++) {
            if (unternehmen[i] != null && unternehmen[i].getPersonalnummer() == pnr) {
                unternehmen[i] = null;
                return true;
            }
        }
        return false;
    }


    public double gesamtlohnkostenBerechnen() {
        double gesamtlohnkisten = 0;
        for (Mitarbeiter einMitarbeiter : unternehmen) {
            if (einMitarbeiter != null) {
                gesamtlohnkisten += einMitarbeiter.berechneMonatsgehalt();
            }
        }
        return gesamtlohnkisten;
    }

    public void drucken() {
        for (Mitarbeiter einMitarbeiter : unternehmen) {
            if (einMitarbeiter != null) {
                einMitarbeiter.drucken();
            }
        }
        System.out.println("------------------GESAMTLOHNKOSTEN------------------");
        System.out.println("Für das Unternehmen " + unternehmensName + " betragen die Gesamtlohnkosten: " + gesamtlohnkostenBerechnen());
        System.out.println("----------------------------------------------------");
    }
}
