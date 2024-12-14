package t1h7;

public class T1H7 {
    public static void main(String[] args) {
        Mitarbeiter alimusae = new Arbeiter(671, "Alimusaj Arlind", "Hauptstraße 23", 2014, 14, 2);
        Mitarbeiter mladen = new Manager(2011, "Mladen Djukic", "Nyugatstraße 13", 2021, 22, 250);
        Mitarbeiter kahrhof = new Ceo(1071, "Michael Kahofer", "Pepsiway 67", 2020, 28, 250, 500);
        Mitarbeiter karpovic = new Angestellter(1523, "Elena Karpovic", "Triesterstraße 58", 2001, 18);

        Unternehmen ITS = new Unternehmen();
        ITS.mitarbeiterAufnehmen(alimusae);
        ITS.mitarbeiterAufnehmen(mladen);
        ITS.mitarbeiterAufnehmen(kahrhof);
        ITS.mitarbeiterAufnehmen(karpovic);
        ITS.drucken();
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        ITS.mitarbeiterKuendigen(671);
        ITS.drucken();
    }
}
