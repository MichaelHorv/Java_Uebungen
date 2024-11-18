package t1I1;

import java.util.Scanner;

public class T1I1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eingabe einer ganzen Zahl:");
        int zahl = Integer.parseInt(input.nextLine());
        input.close();
        if (zahl == 0) {
            System.out.println("Division durch 0 nicht möglich.");
        } else {
            double ergebnis = (double) 1 / zahl;
            System.out.println("Der Kehrwert beträgt: " + ergebnis);
        }
    }
}
