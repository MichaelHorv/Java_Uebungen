package t101;
import java.util.Scanner;

public class T101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anzahl der Fahrkarten eingeben:");

        int fahrKarten = Integer.parseInt(input.nextLine());
        int i = fahrKarten;
        System.out.print("Preis pro Karte eingeben: ");
        double einzelPreis = Double.parseDouble(input.nextLine());
        System.out.println("Eine Fahrkarte kostet " + einzelPreis + "Euro");
        System.out.println("Welcher Rabatt soll genutzt werden?");
        int rabatt = Integer.parseInt(input.nextLine());
        input.close();
        double ermPreis = einzelPreis * ((100d - rabatt) / 100);
        System.out.println("Anzahl der gekauften Fahrkarten: " + i);
        System.out.println("Ermaessigter Preis einer Fahrkarte: " + ermPreis);
        double ermGesPreis = i * ermPreis;
        System.out.println(i + " Fahrkarten kosten insgesamt " + ermGesPreis);

    }

}
