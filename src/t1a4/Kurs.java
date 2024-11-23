package t1a4;

import java.util.Arrays;
import java.util.Objects;

public class Kurs {
    private String kursname;
    private double kurspreis;
    private String[] teilnehmer = new String[10];

    public Kurs(String kursname, double kurspreis) {
        this.kursname = kursname;
        this.kurspreis = kurspreis;
    }

    public boolean aufnehmen(String teilnehmerName) {
        // durch das teinehmer-array durchlaufen.
        for (int i = 0; i < teilnehmer.length; i++) {
            //Überprüfen ob ein Platz frei ist.
            if (teilnehmer[i] == null) {
                teilnehmer[i] = teilnehmerName;
                System.out.println("Platz frei! Der Teilnehmer " + teilnehmerName + " wurde hinzugefügt.");
                //wenn ja -> Teilnehmer eintragen, return true
                return true;
            }
        }
        System.out.println("Der Kurst ist leider schon voll.");
        //wenn nein -> return false
        return false;
    }

    public boolean stornieren(String teilnehmerName) {
        for (int i = 0; i < teilnehmer.length; i++) {
            if (teilnehmer[i] != null && Objects.equals(teilnehmerName, teilnehmer[i])) {
                System.out.println("Der Teilnehmer " + teilnehmerName + " wurde aus dem Kurs entfernt.");
                return true;
            }
        }
        System.out.println("Der Teilnehmer befindet sich nicht im Kurs.");
        return false;
    }

    public void drucken() {
        int teilnehmeranzahl = 0;
        System.out.println("Folgende Teilnehmer befinden sich im Kurs: ");
        for (String einTeilnehmer: teilnehmer) {
            if (einTeilnehmer!=null) {
                teilnehmeranzahl++;
                System.out.print(einTeilnehmer + ", ");
            }
        }
        System.out.println("\nDer " + kursname + " kostet " + kurspreis + " und hat: " + teilnehmeranzahl + " Teilnehmer.");
    }
}
