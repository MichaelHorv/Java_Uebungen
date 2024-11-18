package t104;

import java.util.Scanner;

public class T104 {
    public static void main(String[] args) {
        /*
        Implementieren Sie ein Programm zur Berechnung von Umfang (U) und Fläche (A) eines Kreises. Der
        Radius des Kreises wird über Konsole eingegeben.
        𝑈 = 2 ∙ 𝑟 ∙ 𝜋
        𝐴 = 𝑟 ∙ 𝑟 ∙ 𝜋
         */
        //Objekt Scanner anlegen
        Scanner input = new Scanner(System.in);
        //Eingabe des Radius über die Konsole
        System.out.println("Wird der Durchmesser \"1\", oder der Radius \"2\" angegeben? 1/2");
        int eingabe = Integer.parseInt(input.nextLine());
        if (eingabe == 1) {
            //Eingabe Durchmesser
            System.out.println("Bitte den Durchmesser eingeben: ");
            double durchmesser = Double.parseDouble(input.nextLine());
            //Berechnung Umfang
            double umfang = durchmesser * Math.PI;
            //Berechnung Fläche
            double flaeche = (durchmesser / 2) * (durchmesser / 2) * Math.PI;
            //Ausgabe
            System.out.println("Der Umfang beträgt: " + umfang + "\nDie Fläche beträgt: " + flaeche);
        } else if (eingabe == 2) {
            //Eingabe Radius
            System.out.println("Bitte den Radius eingeben: ");
            double radius = Double.parseDouble(input.nextLine());
            input.close();
            //Berechnung
            double umfang = 2 * radius * Math.PI;
            //Berechnung Fläche
            double flaeche = radius * radius * Math.PI;
            System.out.println("Der Umfang beträgt: " + umfang + "\nDie Fläche beträgt: " + flaeche);
        } else {
            System.out.println("Eingabe ungültig. Programm wird abgebrochen");
        }
    }
}
