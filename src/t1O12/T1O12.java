package t1O12;
import java.util.Scanner;

public class T1O12 {
    public static void main(String[] args) {
        /*T1O12 – Fahrzeit berechnen
        Geben Sie über Konsole die Abfahrtszeit des Zuges in Stunden und Minuten und die Ankunftszeit des
        Zuges in Stunden und Minuten ein. Berechnen Sie die Fahrzeit.
         */
        //Scanner initialisieren
        Scanner input = new Scanner(System.in);
        //Eingabe: abfahrtsStunde
        System.out.println("Zu welcher Stunde ist der Zug abgefahren?: ");
        int abfahrtsStunde = Integer.parseInt(input.nextLine());
        //Eingabe: abfahrtsMinute
        System.out.println("Zu welcher Minute ist der Zug abgefahren?: ");
        int abfahrtsMinute = Integer.parseInt(input.nextLine());
        //Eingabe: ankunftsStunde
        System.out.println("Zu welcher Stunde ist der Zug angekommen?: ");
        int ankunftsStunde = Integer.parseInt(input.nextLine());
        //Eingabe: ankunftsMinute
        System.out.println("Zu welcher Minute ist der Zug angekommen?: ");
        int ankunftsMinute = Integer.parseInt(input.nextLine());
        //Scanner beenden
        input.close();
        //Berechnung: Abfahrt in Minuten abfahrtsStunde * 60 + abfahrtsMinute
        int abfahrtInMinuten = abfahrtsStunde * 60 + abfahrtsMinute;
        //Berechnung: Ankunft in Minuten ankunftsStunde * 60 + ankunftsminute
        int ankunftInMinuten = ankunftsStunde * 60 + ankunftsMinute;
        //Berechnung der Zeitdauer (ankunftInMinuten - abfahrtInMinuten)
        int fahrtDauer = ankunftInMinuten - abfahrtInMinuten;
        int fahrtDauerinStunden = fahrtDauer / 60;
        int fahrtDauerrest = fahrtDauer % 60;
        System.out.println("Die Fahrt dauert " + fahrtDauerinStunden + " Stunden und " + fahrtDauerrest + " Minuten.");
    }
}
