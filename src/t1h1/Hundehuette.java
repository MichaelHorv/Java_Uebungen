package t1h1;

public class Hundehuette {
    Hund[] huette = new Hund[10];

    public boolean neuerHund(Hund h) {
        for (int i = 0; i < huette.length; i++) {
            if (huette[i] == null) {
                huette[i] = h;
                return true;
            }
        }
        return false;
    }

    public void drucken() {
        System.out.println("Folgende Hunde sind in der Hundehütte: ");
        int anzahlS = 0;
        int anzahlB = 0;
        int anzahlK = 0;
        double gesamtSteuer = 0;
        for (Hund einHund : huette) {
            if (einHund != null) {
                einHund.drucken();
                gesamtSteuer += einHund.steuer();
                if (einHund instanceof Schosshund) {
                    anzahlS++;
                } else if (einHund instanceof Blindenhund) {
                    anzahlB++;
                } else {
                    anzahlK++;
                }
            }
        }
        System.out.println("Statistik: ");
        System.out.println(anzahlS + " Schosshunde");
        System.out.println(anzahlB + " Blindenhunde");
        System.out.println(anzahlK + " Kampfhunde");
        System.out.format("Gesamte Hundesteuer: %.2f€", gesamtSteuer);
    }
}
