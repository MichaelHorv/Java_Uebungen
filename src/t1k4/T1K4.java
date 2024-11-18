package t1k4;

import java.util.Scanner;

public class T1K4 {
    public static void main(String[] args) {
        Sparbuch meins = new Sparbuch(2500);
        meins.einzahlen(500);
        System.out.format("Guthaben beträgt: %.2f€\n", meins.getGuthaben());
        Scanner in = new Scanner(System.in);
        System.out.println("Zinssatz eingeben: ");
        double zinssatz = Double.parseDouble(in.nextLine());
        System.out.println("Laufzeit in Monaten eingeben: ");
        int laufzeit = Integer.parseInt(in.nextLine());
        System.out.format("Nach %s Monaten und einem Zinssatz von %.2f Prozent beträgt das Endkapital %.2f€",laufzeit,zinssatz,meins.endKapitalBerechnen(laufzeit, zinssatz));
    }
}
