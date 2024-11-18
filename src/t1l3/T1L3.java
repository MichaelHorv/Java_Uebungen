package t1l3;

import java.util.Scanner;

public class T1L3 {
    public static void main(String[] args) {
        BierLager b = new BierLager(99);
        Scanner input = new Scanner(System.in);
        while (!b.isEmpty()) {
            System.out.print("Wie viele Flaschen sollen gekauft werden? ");
            int flaschen = Integer.parseInt(input.nextLine());
            if (flaschen > b.getLagerstand()) {
                System.out.println("So viele Flaschen sind nicht im Lager.");
            } else {
                b.kaufen(flaschen);
                System.out.println("Viel spaß mit deinem Bier.");
            }
            System.out.println("Es sind " + b.getLagerstand() + " Flaschen im Lager!");
        }
        input.close();
    }
}
