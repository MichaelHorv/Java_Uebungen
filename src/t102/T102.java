package t102;
//Scanner importieren
import java.util.Scanner;
public class T102 {
    public static void main(String[] args) {
        /*
        T1O2 - Zahlen Quadrieren
        Implementieren Sie ein Programm zum Quadrieren einer Zahl, die über die Konsole eingegeben wird.
         */

        //Input Objekt anlegen
        Scanner input = new Scanner(System.in);
        //Eingabe der ganzen Zahl
        System.out.print("Welche ganze Zahl soll quadriert werden: ");
        int i = Integer.parseInt(input.nextLine());
        //Berechnung
        int j = i * i;
        //Die Ausgabe des Ergebnises
        System.out.println("Das Ergebnis beträgt von "+ i +"*"+ i +" beträgt: " + j);
    }
}
