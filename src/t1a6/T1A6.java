package t1a6;

import java.util.Scanner;

public class T1A6 {
    public static void main(String[] args) {
        //Scanner anlegen
        Scanner in = new Scanner(System.in);
        //Ausgabe: Wie viele Moneten sind am Konto:
        System.out.print("Das Sparguthaben beträgt: ");
        //Die Eingabe in der Variable speichern
        double sparGuthaben = Double.parseDouble(in.nextLine());
        //Ausgabe: Welcher Zinssatz soll für die Berechnung genutzt werden?
        System.out.print("Der Zinssatz beträgt: ");
        //Die Eingabe in einer Variable speichern
        double zinsSatz = Double.parseDouble(in.nextLine());
        //Scanner schließen
        in.close();

        //Array anlegen und die maximalen Elemente dafür angeben (11) (0 wird für Jahr 0 verwendet)
        double[] zuwachs = new double[11];
        //sparGuthaben in Index 0 schreiben
        zuwachs[0] = sparGuthaben;
        //Schleife mit der Berechnung Formel zuwachs[i-1] * zinsSatz
        for (int i = 1; i < zuwachs.length; i++) {
            zuwachs[i] = zuwachs[i - 1] * (1 + (zinsSatz/100));
        }
        //Ausgabe in einer extra for schleife damit auch das Jahr 0 Ausgegeben wird.
        for (int i = 0; i < zuwachs.length; i++) {
            System.out.format("Der Sparbetrag im Jahr %d beträgt %.2f€\n", i, zuwachs[i]);
        }
    }
}
