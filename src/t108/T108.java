package t108;
import java.util.Scanner;
public class T108 {
    public static void main(String [] args){
        /*
        T1O8 – Body Mass Index
        Geben Sie über Konsole die Werte für Gewicht und Körpergröße (in Meter) ein. Berechnen Sie den
        Body Mass Index und geben Sie das Resultat auf der Konsole aus.
         */
        //Objekt anlegen
        Scanner input = new Scanner(System.in);
        //Eingabe Gewicht
        System.out.print("Bitte das Gewicht in KG angeben: ");
        double gewicht = Double.parseDouble(input.nextLine());
        //Eingabe Körpergröße in Meter
        System.out.print("Bitte die Körpergröße in Meter angeben: ");
        double groesse = Double.parseDouble(input.nextLine());
        input.close();
        //Berechnung
        double bmi = gewicht / Math.pow(groesse,2);
        //Ausgabe BMI
        System.out.println("Der BodyMassIndex beträgt: " + bmi);
    }
}
