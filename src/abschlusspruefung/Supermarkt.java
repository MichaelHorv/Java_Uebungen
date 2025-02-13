package abschlusspruefung;

public class Supermarkt {
    private Produkte[] produktarray;

    public Supermarkt(int anzahlProdukte) {
        produktarray = new Produkte[anzahlProdukte];
    }

    public boolean produktAufnehmen(Produkte p) {
        for (int i = 0; i < produktarray.length; i++) {
            if (produktarray[i] == null) {
                produktarray[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean produktVerkaufen(String artikelid) {
        for (int i = 0; i < produktarray.length; i++) {
            if (produktarray[i] != null && produktarray[i].getArtikelId().equals(artikelid)) {
                produktarray[i] = null;
                return true;
            }
        }
        return false;
    }

    public void sonderangebot(String artikelId, int prozentsatz) {
        for (Produkte einProdukt : produktarray) {
            if (einProdukt != null && einProdukt.getArtikelId().equals(artikelId)) {
                double ekpreis = einProdukt.getEinkaufspreis();
                einProdukt.setEinkaufspreis(ekpreis - ((ekpreis / 100) * prozentsatz));
            }
        }
    }

    public void drucken() {
        int anzahlLebensmittel = 0;
        int anzahlSpielzeuge = 0;
        int anzahlElektrogeraete = 0;
        double gesamtEKPreis = 0;
        for (Produkte einProdukt : produktarray) {
            if (einProdukt != null) {
                einProdukt.drucken();
                gesamtEKPreis += einProdukt.getEinkaufspreis();
                if (einProdukt instanceof Lebensmittel) {
                    anzahlLebensmittel++;
                } else if (einProdukt instanceof Spielzeug) {
                    anzahlSpielzeuge++;
                } else {
                    anzahlElektrogeraete++;
                }
            }
        }
        System.out.println("+++++++++STATISTIK+++++++++");
        System.out.println("Anzahl an Lebensmittel: " + anzahlLebensmittel);
        System.out.println("Anzahl an Spielzeuge: " + anzahlSpielzeuge);
        System.out.println("Anzahl an Elektrogeräte: " + anzahlElektrogeraete);
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("++++++++FINANZIELLES+++++++");
        System.out.format("Gesamteinkaufspreis: %.2f€\n", gesamtEKPreis);
        System.out.println("+++++++++++++++++++++++++++");
    }


}
