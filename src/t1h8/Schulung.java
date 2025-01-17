package t1h8;

public class Schulung {

    private String titel;
    private double preis;
    private int schulungstag;
    Kursteilnehmer[] kt = new Kursteilnehmer[15];
    private Trainer trainer;


    public Schulung(String titel, double preis, int schulungstag, Trainer trainer) {
        this.titel = titel;
        this.preis = preis;
        this.schulungstag = schulungstag;
        this.trainer = trainer;
    }

    public boolean kursteilnehmerHinzufuegen(Kursteilnehmer a) {
        for (int i = 0; i < kt.length; i++) {
            if (kt[i] == null) {
                kt[i] = a;
                System.out.println("Teilnehmer wurde hinzugefügt.");
                return true;
            }
        }
        System.out.println("Teilnehmer konnte nicht hinzugefügt werden!");
        return false;
    }

    public boolean kursteilnehmerEntfernen(String name) {
        for (int i = 0; i < kt.length; i++) {
            if (kt[i] != null && kt[i].getName().equals(name)) {
                kt[i] = null;
                System.out.println("Teilnehmer wurde entfernt.");
                return true;
            }
        }
        System.out.println("Kursteilnehmer wurde nicht gefunden.");
        return false;
    }

    public double berechneUmsatz() {
        int anzahlKursteilnehmer = 0;
        for (Kursteilnehmer einKusteilnehmer : kt) {
            if (einKusteilnehmer != null) {
                anzahlKursteilnehmer++;
            }
        }
        return anzahlKursteilnehmer * preis;
    }


    public double berechneGewinn() {
        return berechneUmsatz() - (trainer.getTagsatz() * schulungstag);
    }

    public void drucken() {
        System.out.println("------------" + titel + "------------");
        System.out.println("Preis: " + preis);
        System.out.println("Schulungstage: " + schulungstag);
        System.out.println("------------Trainer------------");
        if (trainer != null) {
            trainer.drucken();
        } else {
            System.out.println("Noch kein Trainer gesetzt.");
        }
        System.out.println("------------Kursteilnehmer------------");
        for (Kursteilnehmer einKursteilnehmer : kt) {
            if (einKursteilnehmer != null) {
                einKursteilnehmer.drucken();
                System.out.println("------------------------------------");
            }

        }
    }


}
