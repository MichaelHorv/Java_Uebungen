package t105;
import java.util.Scanner;
public class T105 {
    public static void main(String [] args){
        /*T1O5 – Inhalt Geldbörse berechnen
        Geben Sie über Konsole die Zahl der 1 Euro, 2 Euro Münzen und 5 Euro Scheine in Ihrer Geldbörse
        ein. Berechnen Sie den Gesamtbetrag und geben Sie diesen auf der Konsole aus
         */
        //Obejekt anlegen
        Scanner input = new Scanner(System.in);
        //Eingabe der Anzahl der 1€ Münzen
        System.out.print("Bitte die Anzahl der 1€ Münzen angeben: ");
        int einEuro = Integer.parseInt(input.nextLine());
        //Eingabe der Anzahl der 2€ Münzen
        System.out.print("Bitte die Anzahl der 2€ Münzen angeben: ");
        int zweiEuro = Integer.parseInt(input.nextLine());
        //Eingabe der Anzahl der 5€ Scheine
        System.out.print("Bitte die Anzahl der 5€ Scheine angeben: ");
        int fuenfEuro = Integer.parseInt(input.nextLine());
        //Scanner verwerfen
        input.close();
        //Berechnung
        int summe = einEuro + zweiEuro * 2 + fuenfEuro * 5;
        //Ausgabe des gesamten Inhalt in Euro
        System.out.print("Insgesamt befinden sich " + summe + "€ in der Geldbörse.");
    }
}
