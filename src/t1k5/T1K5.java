package t1k5;
import java.util.Scanner;

public class T1K5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seiteA = wertEinlesen(input, 'A');
        int seiteB = wertEinlesen(input, 'B');

        input.close();
        Rechteck no1 = new Rechteck(seiteA, seiteB);
        System.out.format("Fläche: %s",no1.flaeche());
        System.out.format("\nUmfang: %s",no1.umfang());
    }

    /*
    Dont repeat yourself, wenn eine funktion öfter benötigt wird, kann dafür eine Methode erstellt werden.
     */
    private static int wertEinlesen(Scanner input,char nameSeite){
        int seite = 0;
        do {
            System.out.print("Seitenlänge für " + nameSeite + " eingeben: ");
            seite = Integer.parseInt(input.nextLine());
        } while (seite <= 0);
        return seite;
    }

}
