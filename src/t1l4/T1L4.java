package t1l4;

import java.util.Scanner;

public class T1L4 {
    public static void main(String[] args) {
        BankKonto konto = new BankKonto(1000, 100);
        Scanner input = new Scanner(System.in);
        int angabe = 0;
        do {
            System.out.println(konto.getKontostand());
            System.out.println("1 Einzahlen, 2 Auszahlen, 3 Beenden.");
            angabe = Integer.parseInt(input.nextLine());
            if (angabe == 1) {
                System.out.println("Wie viel Geld soll eingezahlt werden?: ");
                double einzahlung = Double.parseDouble(input.nextLine());
                konto.einzahlen(einzahlung);
            } else if (angabe == 2) {
                System.out.println("Wie viel Geld soll abgehoben werden?: ");
                double auszahlung = Double.parseDouble(input.nextLine());
                if (konto.abheben(auszahlung)) {
                    System.out.println("Betrag wurde erfolgreich abgehoben.");
                } else {
                    System.out.println("Der Betrag übersteigt den Kontostand und den Überziehungsrahmen.");
                }
            } else if (angabe == 3) {
                System.out.println("Programm wird beendet.");
                break;
            } else {
                System.out.println("Falsche Angabe. Programm wird beendet.");
                break;
            }
        } while (angabe < 3);
        System.out.println(konto.getKontostand());
    }
}