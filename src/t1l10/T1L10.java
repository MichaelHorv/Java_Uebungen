package t1l10;

import java.util.Scanner;

public class T1L10 {
    public static void main(String[] args) {
        /*
        T1I10 – Pizzaservice
        Jede Pizza kostet 11€. Wenn die Pizzen selbst abgeholt werden, gibt es einen Rabatt von 2€ pro Pizza.
        Wenn 5 oder noch mehr Pizzen bestellt werden, dann gibt es 10 Prozent Rabatt. Lesen Sie von der
        Konsole ein wie viele Pizzen Sie bestellen möchten und ob Sie die Pizzen selbst abholen.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Werden die pizzen selbst abgeholt? y/n");
        char abholung = input.nextLine().charAt(0);
        System.out.println("Wie viele die pizzen werden bestellt?");
        int anzahl = Integer.parseInt(input.nextLine());
        int pizzaPreis = 11;
        if (abholung == 'y') {
            int ergebnis = anzahl * (pizzaPreis - 2);
            System.out.println("Die Pizzen kosten " + ergebnis + "€");
        } else {
            if (anzahl >= 5) {
                int zwischenErgebnis = (pizzaPreis * anzahl);
                double ergebnis = zwischenErgebnis - (zwischenErgebnis * 0.1);
                System.out.println("Die Pizzen kosten " + ergebnis + "€");
            } else {
                System.out.println("Die Pizzen kosten " + (anzahl * pizzaPreis) + "€");
            }

        }
    }
}
