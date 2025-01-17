package t1h3;

public class Stall {
    private Saeugetier[] s;

    public Stall(int anzahlTiere) {
        s = new Saeugetier[anzahlTiere];
    }

    public void tierHinzufuegen(Saeugetier tier) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = tier;
                System.out.println("Tier: " + tier.getClass().getSimpleName() + " hinzugefügt.");
                return;
            }
        }
        System.out.println("Keine freie Stelle gefunden.");
    }

    public void tierEntfernen(String tiername) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].getName().equals(tiername)) {
                System.out.println(s[i].getClass().getSimpleName() + " " + tiername + " wurde entfernt.");
                s[i] = null;
                return;
            }
        }
        System.out.println("Tier wurde nicht gefunden.");
    }


    public void drucken() {

        for (Saeugetier einTier : s) {
            if (einTier != null) {
                einTier.drucken();

            }
        }
    }

    public void statistik() {
        int anzahlKatze = 0;
        int anzahlHunde = 0;
        int anzahlKuehe = 0;
        int anzahlPferde = 0;
        double anzahlMilchertrag = 0;
        for (Saeugetier einTier : s) {
            if (einTier != null) {
                if (einTier instanceof Katze) {
                    anzahlKatze++;
                } else if (einTier instanceof Hund) {
                    anzahlHunde++;
                } else if (einTier instanceof Kuh eineKuh) {
                    anzahlKuehe++;
                    anzahlMilchertrag += eineKuh.getMilchertrag();
                } else {
                    anzahlPferde++;
                }
            }
        }
        System.out.println("------------------STATISTIK------------------");
        System.out.println("Anzahl Katzen: " + anzahlKatze);
        System.out.println("Anzahl Hunde: " + anzahlHunde);
        System.out.println("Anzahl Pferde: " + anzahlPferde);
        System.out.println("Anzahl Kühe: " + anzahlKuehe);
        System.out.println("Anzahl Milchertrag: " + anzahlMilchertrag);
        System.out.println("---------------------------------------------");

    }

    public void party() {
        for (Saeugetier einTier : s) {
            if (einTier != null) {
                einTier.gibLaut();
            }
        }
    }


}
