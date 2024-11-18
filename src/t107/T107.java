package t107;
import java.util.Scanner;

public class T107 {
    public static void main(String [] args){
        /*
        T1O7 – Berechnung Fahrenheit
        Geben Sie eine Temperatur in Celsius über Konsole ein. Rechnen Sie diesen Wert in Fahrenheit um
        und geben Sie das Resultat auf der Konsole aus.
        Die Umrechnung erfolgt nach folgender Formel: TF = 32 + 1,8 * TC
         */
        //Objekt anlegen
        Scanner input = new Scanner(System.in);
        //Eingabe der Temperatur in Celsius
        System.out.print("Die Temperatur in Celsius angeben: ");
        double celsius = Double.parseDouble(input.nextLine());
        input.close();
        //Berechnung
        double ergebnis = 32 + 1.8 * celsius;
        System.out.print(celsius + " Grad Celsius sind " + ergebnis + " Grad Fahrenheit.");
    }
}
