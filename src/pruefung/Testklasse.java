package pruefung;

import java.util.Scanner;

public class Testklasse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Abflugort eingeben: ");
        String departure = in.nextLine();
        System.out.print("Zielort eingeben: ");
        String arrival = in.nextLine();
        double basisPreis;
        do {
            System.out.print("Den Basispreis für den Flug eingeben: ");
            basisPreis = Double.parseDouble(in.nextLine());
        } while (basisPreis <= 0);

        boolean firstClass = false;
        System.out.print("Handelt es sich dabei um einen First Class Flug? j/n:");
        char firstClassChar = in.nextLine().charAt(0);
        if (firstClassChar == 'J' || firstClassChar == 'j') {
            firstClass = true;
        }

        boolean verpflegung = false;
        System.out.print("Ist für den Flug eine Verpflegung erwünscht? j/n: ");
        char verpflegungChar = in.nextLine().charAt(0);
        if (verpflegungChar == 'J' || verpflegungChar == 'j') {
            verpflegung = true;
        }

        Flug OS567 = new Flug(departure, arrival, basisPreis, firstClass, verpflegung);

        int anzahlGepaeck;
        do {
            System.out.print("Wie viele Gepäckstücke werden mitgenommen?: ");
            anzahlGepaeck = Integer.parseInt(in.nextLine());
        } while (anzahlGepaeck < 0);

        OS567.setAnzahlGepaeck(anzahlGepaeck);
        in.close();
        OS567.drucken();
    }
}
