package t106;
import java.util.Scanner;
public class T106 {
    public static void main(String [] args){
        /*
        T1O6 –Mwst Berechnung
        Geben Sie über Konsole den Bruttopreis und den Mwst Satz einer Ware an. Berechnen Sie dann den
        Nettopreis sowie den Mwst Betrag und geben Sie beides auf der Konsole aus.
         */
        //Objekt erstellen
        Scanner input = new Scanner(System.in);
        //Eingabe des Bruttobetrags
        System.out.print("Den Bruttopreis angeben: ");
        double bruttoBetrag = Double.parseDouble(input.nextLine());
        //Eingabe der Mwst
        System.out.print("Den Prozentsatz der Mehrwertsteuer eingeben: ");
        double mehrWert = Double.parseDouble(input.nextLine());
        //Objekt verwerfen
        input.close();
        //Berechnung des Betrags der Mwst
        double summeMwst = mehrWert * bruttoBetrag / 100;
        //Berechnung Nettobetrag
        double nettoBetrag = bruttoBetrag - summeMwst;
        //Ausgabe des Nettobetrags + Mwst
        System.out.println("Der Mehrwertsteuerbetrag beträgt: " + summeMwst);
        System.out.println("Der Nettobetrag beträgt: " + nettoBetrag);
    }
}
