package t1k10;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private double monatsgehalt;

    //Konstruktor erstellen
    public Mitarbeiter(String vorname, String nachname, double monatsgehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsgehalt = monatsgehalt;
    }

    public void setVorname(String a) {
        vorname = a;
    }

    public String getVorname() {
        return vorname;
    }

    public void setNachname(String a) {
        nachname = a;
    }

    public String getNachname() {
        return nachname;
    }

    public void setMonatsgehalt(double a) {
        monatsgehalt = a;
    }

    public double getMonatsgehalt() {
        return monatsgehalt;
    }

    public void drucken() {
        System.out.println("Der Mitarbeiter/Die Mitarbeiterin: " + vorname + " " + nachname + " verdient im Monat: " + monatsgehalt + "€");
    }

    public void calculateNewMonatsgehalt(int prozent) {
        monatsgehalt += monatsgehalt / 100 * prozent;
    }

    public double berechneJahresgehalt() {
        return monatsgehalt * 14;
    }
}
