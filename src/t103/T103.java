package t103;
import java.util.Scanner;
public class T103 {
    public static void main(String [] args){
        /*
        T1O3 – Rechteck berechnen
        Implementieren Sie ein Programm zur Berechnung von Umfang und Fläche eines Rechtecks. Die
        Seitenlängen des Rechtecks werden über Konsole eingegeben.
         */
        //Input Objekt anlegen
        Scanner input = new Scanner(System.in);
        //Seitenlänge A
        System.out.print("Bitte die Seitelänge A angeben: ");
        double seitenlaengeA = Double.parseDouble(input.nextLine());
        //Seitelänge B
        System.out.print("Bitte die Seitelänge B angeben: ");
        double seitenlaengeB = Double.parseDouble(input.nextLine());
        //Berechnung
        double summeFlaeche = seitenlaengeA * seitenlaengeB;
        double summeUmfang = 2 * seitenlaengeA + 2 * seitenlaengeB;
        //Ausgabe
        System.out.println("Die Fläche des Rechtecks beträgt: " + summeFlaeche);
        System.out.println("Der Umfang des Rechtecks beträgt: " + summeUmfang);
    }
}
