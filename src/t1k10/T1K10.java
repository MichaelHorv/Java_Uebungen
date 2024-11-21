package t1k10;

public class T1K10 {
    public static void main(String[] args) {
        //Anlegen des 1. Mitarbeiters
        Mitarbeiter mm = new Mitarbeiter("Max", "Mustermann", 4000);
        //Anlegen des 2. Mitarbeiters
        Mitarbeiter gg = new Mitarbeiter("Gustav", "Gast", 5000);

        //drucken methode aufrufen
        mm.drucken();
        gg.drucken();

        //Ausgabe Jahresgehalt von mm
        System.out.println("Das Jahresgehalt von " + mm.getVorname() + " " + mm.getNachname() + " beträgt: " + (mm.berechneJahresgehalt()) + "€");
        //Ausgabe Jahresgehalt von gg
        System.out.println("Das Jahresgehalt von " + gg.getVorname() + " " + gg.getNachname() + " beträgt: " + (gg.berechneJahresgehalt()) + "€");

        //über die Methode calculateNewMonatsgehalt ein neues Montagsgehalt für mm übergeben.
        mm.erhoeheMonatsgehaltInProzent(15);
        //über die Methode calculateNewMonatsgehalt ein neues Montagsgehalt für gg übergeben.
        gg.erhoeheMonatsgehaltInProzent(3);

        //Ausgabe des neuen Monatsgehaltes des Mitarbeiters mm.
        System.out.format("Nach der Anpassung beträgt das Jahresgehalt von %s %s, %.2f€\n", mm.getVorname(), mm.getNachname(), (mm.berechneJahresgehalt()));
        //Ausgabe des neuen Monatsgehaltes des Mitarbeiters gg.
        System.out.format("Nach der Anpassung beträgt das Jahresgehalt von %s %s, %.2f€", gg.getVorname(), gg.getNachname(), (gg.berechneJahresgehalt()));
    }
}
