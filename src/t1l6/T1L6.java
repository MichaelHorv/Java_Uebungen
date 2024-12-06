package t1l6;

import java.util.Scanner;

public class T1L6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int eingabe;
        boolean sw = false;
        do {
            System.out.print("Zahl eingeben: ");
            eingabe = Integer.parseInt(in.nextLine());
            if (eingabe > 0){
                System.out.println("Die eingegebene Zahl beträgt: " + eingabe);
                sw = false;
            } else if (eingabe == 0 && !sw){
                sw = true;
                System.out.printf("Die eingegebene Zahl beträgt: " + eingabe + "\n");
            }
        } while (eingabe != -111);
        System.out.println("Eingabefilter beendet!");
    }
}
