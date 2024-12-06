package t1k6;

import java.util.Scanner;

public class T1k6 {
    public static void main(String[] args) {
        Konto mm = new Konto("Max Mustermann", 200, 100);
        Scanner in = new Scanner(System.in);
        mm.drucken();
        int loop;
        do {
            System.out.println("Soll ausgezahlt oder einbezahlt werden? 1/2");
            int var = Integer.parseInt(in.nextLine());
            if (var == 1) {
                System.out.println("Betrag für die Auszahlung eingeben: ");
                double aus = Double.parseDouble(in.nextLine());
                mm.auszahlung(aus);
            } else if (var == 2) {
                System.out.println("Betrag für die Einzahlung angeben: ");
                double ein = Double.parseDouble(in.nextLine());
                mm.einzahlung(ein);
            }
            mm.drucken();
            System.out.println("Soll ein weiterer Durchgang ausgeführt werden? 1/2");
            loop = Integer.parseInt(in.nextLine());
        } while (loop == 1);
    }
}
