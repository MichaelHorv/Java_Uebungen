package t1h7;

public class T1H7 {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Arbeiter(671, "Friedrich Hollenberger", "Hauptstraße 23", 2014, 14, 2);
        Mitarbeiter m2 = new Manager(2011, "Peter Lustig", "Sesamstraße 13", 2021, 22, 250);
        Mitarbeiter m3 = new Ceo(1071, "Hans Hansen", "Wienerstraße 67", 2020, 28, 300, 500);
        Mitarbeiter m4 = new Angestellter(1523, "Judith Bauer", "Triesterstraße 58", 2001, 18);
        Mitarbeiter m5 = new Angestellter(1524, "Ruth Hauser", "Wiesenweg 76", 2001, 17);
        Mitarbeiter m6 = new Angestellter(1525, "Johann Müller", "Eichtalstraße 12", 2010, 14);
        Mitarbeiter m7 = new Angestellter(1526, "Michael Hansen", "Bachgasse 193", 2023, 13);

        Unternehmen ITS = new Unternehmen();

        if (ITS.mitarbeiterAufnehmen(m1)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m2)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m3)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m4)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m5)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m6)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        if (ITS.mitarbeiterAufnehmen(m7)) {
            System.out.println("Der Mitarbeiter befindet sich jetzt im Unternehmen.");
        } else {
            System.out.println("Es konnte keine freie Stelle für den Mitarbeiter gefunden werden.");
        }
        ITS.drucken();
        System.out.println("\n\n\n\n\n\n\n\n");

        if (ITS.mitarbeiterKuendigen(671)) {
            System.out.println("Der Mitarbeiter wurde gekündigt.");
        } else {
            System.out.println("Der Mitarbeiter wurde nicht gefunden.");
        }
        if (ITS.mitarbeiterKuendigen(2011)) {
            System.out.println("Der Mitarbeiter wurde gekündigt.");
        } else {
            System.out.println("Der Mitarbeiter wurde nicht gefunden.");
        }
        if (ITS.mitarbeiterKuendigen(20123)) {
            System.out.println("Der Mitarbeiter wurde gekündigt.");
        } else {
            System.out.println("Der Mitarbeiter wurde nicht gefunden.");
        }
        ITS.drucken();
    }
}

