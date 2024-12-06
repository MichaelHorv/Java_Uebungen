package t1a11;

import java.util.Scanner;

public class T1A11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Automatisch oder Manuell? 1/2");
        int a = Integer.parseInt(input.nextLine());
        if (a == 1) {
            Rechnung rn = new Rechnung(120);
            Ware apfel = new Ware("Apfel", "91dfd02", 1.2);
            Ware birne = new Ware("Birne", "912df32df", 1.1);
            Ware essig = new Ware("Essig", "12df2", 2.9);
            Ware mehl = new Ware("Mehl", "647f2", 1.8);
            Ware sugo = new Ware("Sugo", "e323", 2.1);
            rn.neueWare(10, apfel);
            rn.neueWare(8, birne);
            rn.neueWare(8, essig);
            rn.neueWare(2, mehl);
            rn.neueWare(8, sugo);
            rn.drucken();
        } else {
            Rechnung r = new Rechnung(5);
            Scanner in = new Scanner(System.in);
            for (int i = 1; i <= 3; i++) {
                System.out.println("Artikelbezeichnung eingeben");
                String bez = in.nextLine();
                System.out.println("Artikelnummer eingeben");
                String nummer = in.nextLine();
                double preis;
                do {
                    System.out.println("Artikelpreis eingeben");
                    preis = Double.parseDouble(in.nextLine());
                } while (preis < 0);
                Ware w = new Ware(bez, nummer, preis);
                int anzahl;
                do {
                    System.out.printf("Anzahl eingeben: ");
                    anzahl = Integer.parseInt(in.nextLine());
                } while (anzahl <= 0);
                r.neueWare(anzahl, w);
            }
            in.close();
            r.drucken();
        }
    }
}
