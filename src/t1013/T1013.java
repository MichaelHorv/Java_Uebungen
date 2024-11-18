package t1013;
//Scanner util importieren damit nicht jedes mal java.util.Scanner geschrieben werden muss

import java.util.Scanner;

public class T1013 {
    public static void main(String[] args) {
        /*
        AUFGABE:
        T1O13 – LKW Fahrten
        Geben Sie über Konsole ein wie viele Kisten transportiert werden müssen und wie viele Kisten bei
        einer LKW Fahrt transportiert werden können. Geben Sie auf der Konsole aus wie viele volle Fahrten
        der LKW unternehmen muss und die Restmenge an Kisten die dann noch übrigbleibt.
         */

        //Objekt "input" definieren
        Scanner input = new Scanner(System.in);
        //Eingabe der gesamten Kisten
        System.out.print("Die Anzahl der zu transportierenden Kisten eingeben: ");
        int kistenGesamt = Integer.parseInt(input.nextLine());
        //Eingabe der Kisten pro LKW
        System.out.print("Die Anzahl der Kisten, die ein LKW transportieren kann, angeben: ");
        int kistenLkw = Integer.parseInt(input.nextLine());
        //Scanner verwerfen
        input.close();
        //Berechnung der vollen Fahrten
        int fahrten = kistenGesamt / kistenLkw;
        //Die restlichen Kisten über den Modulo Operator berechnen
        int rest = kistenGesamt % kistenLkw;
        //Ausgabe
        System.out.println("Der LKW kann " + fahrten + " volle Fahrten unternehmen");
        System.out.println("Die Anzahl der uebrigen Kisten: " + rest);
    }
}
