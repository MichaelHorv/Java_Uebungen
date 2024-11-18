package t1O11;
import java.util.Scanner;
public class T1O11 {
    public static void main(String[] args) {
    /*
    T1O11 – Gehalt
    Geben Sie über Konsole den Stundensatz des Mitarbeiters ein, sowie die Anzahl der im Monat
    geleisteten 50% Überstunden und der 100% Überstunden. Berechnen Sie dann das monatliche
    Gesamtgehalt. Kalkulieren Sie mit 38.5 Stunden pro Woche und 4 Wochen pro Monat.
     */
        //Scanner initialisieren
        Scanner input = new Scanner(System.in);
        //Angabe Stundensatz
        System.out.println("Den Stundensatz des Mitarbeiters eingeben: ");
        double stundenSatz = Double.parseDouble(input.nextLine());
        //Angabe der 50% Überstunden
        System.out.println("Die Anzahl der 50% Überstunden angeben: ");
        int arbeitsStunden50 = Integer.parseInt(input.nextLine());
        //Angabe der 100% Überstunden
        System.out.println("Die Anzahl der 100% Überstunden angeben: ");
        int arbeitsStunden100 = Integer.parseInt(input.nextLine());
        input.close();
        //Berechnung mit regulärer Arbeitszeit
        double verguetungRegulaer = (38.5 * 4) * stundenSatz;
        //Berechnung mit 50% Überstunden
        double verguetungMit50 = (arbeitsStunden50 * 1.5) * stundenSatz;
        //Berechnung mit 100% Überstunden
        double verguetungMit100 = (arbeitsStunden100 * 2) * stundenSatz;
        //Addition der regulären Stunden + Überstunden
        double verguetung = verguetungRegulaer + verguetungMit50 + verguetungMit100;
        //Ausgabe Gehalt
        System.out.println("Der Mitarbeiter hat in diesem Monat " + verguetung + "€, mit einem Stundensatz von " + stundenSatz + "€ verdient.");
    }
}
