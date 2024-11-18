package t1I2;

import java.util.Scanner;

public class T1I2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ist das Mitglied nur verheiratet? 1,\n Ist das Mitglied ein Student? 2,\n Ist das Mitglied ein verheirateter Student?  3,\n" +
                " Ist das Mitglied weder ein Student noch verheiratet? 4");
        int i = Integer.parseInt(input.nextLine());
        if (i == 1) {
            System.out.println("Das Mitglied muss 400€ bezahlen.");
        }
        if (i == 2) {
            System.out.println("Das Mitglied muss 300€ bezahlen.");
        }
        if (i == 3) {
            System.out.println("Das Mitglied muss 200€ bezahlen.");
        }
        if (i == 4) {
            System.out.println("Das Mitglied muss 500€ bezahlen.");
        }
    }
}