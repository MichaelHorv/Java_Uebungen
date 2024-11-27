package t1a3;

public class T1A3 {
    public static void main(String[] args) {
        //Objekt array mit der max. Anzahl 3 erstellen.
        Hund[] meineHunde = new Hund[3];
        //Über Konstruktor die Hunde mit dem Namen und dem Alter anlegen
        meineHunde[0] = new Hund("Flocki", 6);
        meineHunde[1] = new Hund("Bello", 8);
        meineHunde[2] = new Hund("Kiri", 4);

        //Schleife mit der Ausgabe
        for (Hund hund : meineHunde) {
            hund.bellen();
        }
    }
}
