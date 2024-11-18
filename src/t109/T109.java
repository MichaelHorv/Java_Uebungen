package t109;
//Scanner util importieren damit nicht jedes mal java.util.Scanner geschrieben werden muss

import java.util.Scanner;

public class T109 {

    public static void main(String[] args) {
        /*
        AUFGABE:
        T1O9 – Benzinverbrauch
        Geben Sie über Konsole die Anzahl der gefahrenen Kilometer und die verbrauchten Liter Benzin ein.
        Berechnen Sie den Benzinverbrauch pro 100 km und das für die Strecke angefallene Amtliche
        Kilometergeld (0.42€/km).
         */

        //Objekt input definieren
        Scanner input = new Scanner(System.in);
        //Eingabe der gefahrenen Kilometer
        System.out.print("Gefahrene Kilometer als ganze Zahl eingeben: ");
        int kilometer = Integer.parseInt(input.nextLine());
        //Eingabe verbrauchte Liter Benzin
        System.out.print("Treibstoff in Liter als ganze Zahl eingeben: ");
        int treibstoff = Integer.parseInt(input.nextLine());
        //Das Objekt input verwerfen
        input.close();
        /*
        Berechnung des Verbrauchs auf 100km muss gecastet werden, weil das Ergebnis
         in der division eine gleitkomma Zahl sein kann.
         Formel = Liter / KM = Liter Pro KM * 100 = Liter auf 100 km.
        */
        double kmTreibstoff = ((double) treibstoff / kilometer) * 100;
        //Berechnung Kilometer * 0.42 <- ist schon eine Dezimalzahl, somit eruebrigt sich das zusaetzliche casten
        double kilometerGeld = 0.42 * kilometer;
        //Ausgabe Verbrauch auf 100km und das amtliche Kilometergeld
        //NOTE: Über die System.out.format funktion, ist es moeglich, die Dezimalzahl auf eine bestimmte Anzahl von Nachkommastellen zu begrenzen.
        System.out.format("Der Benzinverbrauch beträgt: %.2f L/100km\n", kmTreibstoff);
        System.out.format("Das angefallene amtliche Kilometergeld beträgt: %.2f€", kilometerGeld);
    }
}
