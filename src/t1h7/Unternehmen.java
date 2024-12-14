package t1h7;

public class Unternehmen {
    Mitarbeiter[] ITSec = new Mitarbeiter[30];

    public boolean mitarbeiterAufnehmen(Mitarbeiter mitarbeiter) {
        for (int i = 0; i < ITSec.length; i++) {
            if (ITSec[i] == null) {
                ITSec[i] = mitarbeiter;
                return true;
            }
        }
        return false;
    }

    public boolean mitarbeiterKuendigen(int perso) {
        for (int i = 0; i < ITSec.length; i++) {
            if (perso == ITSec[i].getPersonalnummer()) {
                ITSec[i] = null;
                return true;
            }
        }
        return false;
    }


    public double gesamtlohnkostenBerechnen() {
        double gesamtlohnkisten = 0;
        for (Mitarbeiter einMitarbeiter : ITSec) {
            if (einMitarbeiter != null) {
                gesamtlohnkisten += einMitarbeiter.berechneMonatsgehalt();
            }
        }
        return gesamtlohnkisten;
    }

    public void drucken() {
        for (Mitarbeiter einMitarbeiter : ITSec) {
            if (einMitarbeiter != null) {
                einMitarbeiter.drucken();
                System.out.println("Gesamtlohnkosten: " + gesamtlohnkostenBerechnen());
            }
        }
    }
}
