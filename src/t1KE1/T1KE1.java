package t1KE1;
//Scanner zum Einlesen von der Konsole vorbereiten
import java.util.Scanner;
public class T1KE1 {

    public static void main(String[] args) {
        //Objekt deklariert
        java.util.Scanner input = new java.util.Scanner(System.in);

        //int (Ganze Zahl)
        System.out.print("Bitte die Zahl eingeben: ");
        //input.nextLine() - liest eine ganze Zeile von der Konsole als Zeichenkette
        //Die variable ganzeZahl über Integer.parseInt (Umwandlung der Zeichenkette auf Datentyp int)
        //deklarieren
        int ganzeZahl = Integer.parseInt(input.nextLine());
        System.out.println("Eingegeben wurde: " + ganzeZahl);

        //double (Gleitkommazahl)
        System.out.print("Gleitkommazahl eingeben: ");
        double gleitkommaZahl = Double.parseDouble(input.nextLine());
        System.out.println("Die Gleitkommazahl ist: " + gleitkommaZahl);

        //char (Character)
        System.out.print("Character eingeben: ");
        char einZeichen = input.nextLine().charAt(0);
        System.out.println("Der Character " + einZeichen + " wurde eingegeben.");

        //String (Zeichenkette)
        System.out.print("Zeichenkette eingeben: ");
        String zeichenkette = input.nextLine();
        System.out.println("Der Zeichensatz \"" + zeichenkette + "\" wurde eingegeben.");

        //Scanner abschließen
        input.close();

        // TODO hier ist noch Arbeit offen.
    }

}
