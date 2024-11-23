package t1a2;

public class Ratespiel {
    public void spiele() {
        int zufallszahl = (int) (Math.random() * 10);
        //Spieler Array anlegen
        Spieler[] spieler = new Spieler[3];
        //Spieler Objekte erzeugen und im Array speichern
        spieler[0] = new Spieler("Hansi");
        spieler[1] = new Spieler("Gerti");
        spieler[2] = new Spieler("Fredl");
        //Endlosschleife
        while (true) {
            for (Spieler einSpieler : spieler) {
                int zz = einSpieler.rateZahl();
                if (zz == zufallszahl) {
                    System.out.println("Sehr gut die Zahl " + zufallszahl + " wurde gefunden.");
                    System.out.println("Der Gewinner ist " + einSpieler.getName());
                    return;
                } else {
                    System.out.println("Falsch geraten " + einSpieler.getName() + " mit " + zz);
                }
            }
        }
    }
}
