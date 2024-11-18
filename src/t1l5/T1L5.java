package t1l5;

import java.util.Scanner;

public class T1L5 {
    public static void main(String[] args) {
        //Scanner anlegen
        Scanner input = new Scanner(System.in);

        //Variablen initialisieren, damit diese auch ausserhalb der Schleife verfügbar sind.
        double eingabe;
        double summe = 0;
        double produkt = 1;

        //do schleife, da erst in der Schleife bekannt wird, ob noch einmal durchgegangen werden muss.
        do {
            //Ausgabe: "Zahl eingeben: "
            System.out.print("Zahl eingeben: ");
            //Eingabe: Zahl
            eingabe = Double.parseDouble(input.nextLine());
            //Prüfung ob eingabe != 0
            if (eingabe != 0) {
                summe += eingabe;
                produkt *= eingabe;
                System.out.format("Summe: %.2f Produkt: %.2f\n", summe, produkt);
            }
            //Bedingung der Schleife
        } while (eingabe != 0);
        //Scanner schließen.
        input.close();
        //Ausgabe: Eingabe beendet.
        System.out.println("Eingabe beendet.");
        System.out.format("Endsumme: %.2f und Endprodukt: %.2f", summe, produkt);
    }
}
