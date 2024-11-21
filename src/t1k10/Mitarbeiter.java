package t1k10;

public class Mitarbeiter {
    //Instanzvariablen erstellen
    private String vorname;
    private String nachname;
    private double monatsgehalt;

    //Über Konstruktor Instanzvariablen setzen
    public Mitarbeiter(String vorname, String nachname, double monatsgehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsgehalt = monatsgehalt;
    }

    //Setter für Vorname erstellen
    public void setVorname(String a) {
        vorname = a;
    }

    //Getter für Vorname erstellen
    public String getVorname() {
        return vorname;
    }

    //Setter für Nachname erstellen
    public void setNachname(String a) {
        nachname = a;
    }

    //Getter für Nachname erstellen
    public String getNachname() {
        return nachname;
    }

    //Setter für Monatsgehalt erstellen
    public void setMonatsgehalt(double a) {
        monatsgehalt = a;
    }

    //Getter für Monatsgehalt erstellen
    public double getMonatsgehalt() {
        return monatsgehalt;
    }

    //Funktion drucken erstellen
    public void drucken() {
        System.out.println("Der Mitarbeiter/Die Mitarbeiterin: " + vorname + " " + nachname + " verdient im Monat: " + monatsgehalt + "€");
    }

    //Methode "erhöhe Monatsgehalt in Prozent" erstellen (monatsgehalt += monatsgehalt /100 * variable)
    public void erhoeheMonatsgehaltInProzent(int prozent) {
        monatsgehalt += monatsgehalt / 100 * prozent;
    }

    //Methode "berechne Jahresgehalt" erstellen. (Monatsgehalt * 14)
    public double berechneJahresgehalt() {
        return monatsgehalt * 14;
    }
}
