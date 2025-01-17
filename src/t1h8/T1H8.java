package t1h8;

public class T1H8 {
    public static void main(String[] args) {

        Kursteilnehmer tn1 = new Kursteilnehmer("Paul Seiler", "Holstenwall 35", "034928 76 11", "JoeAFawcett@teleworm.us");
        Kursteilnehmer tn2 = new Kursteilnehmer("Sophie Keller", "Bergstrasse 21", "045672 98 32", "SophieKeller@mail.com");
        Kursteilnehmer tn3 = new Kursteilnehmer("Lukas Meier", "Marktplatz 7", "012345 67 89", "LukasM@provider.net");
        Kursteilnehmer tn4 = new Kursteilnehmer("Anna Schmidt", "Bahnhofstrasse 15", "089 123 4567", "Anna.Schmidt@web.de");
        Kursteilnehmer tn5 = new Kursteilnehmer("Maximilian Braun", "Goethestrasse 42", "030 987 6543", "Max.B@domain.com");
        Kursteilnehmer tn6 = new Kursteilnehmer("Marie Fischer", "Lindenweg 8", "040 456 7890", "Marie.Fischer@mail.com");
        Kursteilnehmer tn7 = new Kursteilnehmer("Jonas Becker", "Hauptstrasse 50", "0201 234 5678", "Jonas.Becker@internet.org");
        Kursteilnehmer tn8 = new Kursteilnehmer("Laura Weber", "Schillerplatz 12", "0711 345 6789", "Laura.W@example.com");
        Kursteilnehmer tn9 = new Kursteilnehmer("Felix Wagner", "Schlossallee 3", "0621 876 5432", "Felix.Wagner@provider.net");
        Kursteilnehmer tn10 = new Kursteilnehmer("Emma Hoffmann", "Rathausstrasse 1", "0551 123 456", "Emma.H@mail.de");
        Kursteilnehmer tn11 = new Kursteilnehmer("Leon Richter", "Kirchweg 19", "0221 987 654", "Leon.R@domain.org");
        Kursteilnehmer tn12 = new Kursteilnehmer("Clara Klein", "Wiesenweg 4", "0381 234 567", "Clara.Klein@example.com");
        Kursteilnehmer tn13 = new Kursteilnehmer("Julian Koch", "Feldstrasse 33", "0421 456 789", "Julian.K@mail.org");
        Kursteilnehmer tn14 = new Kursteilnehmer("Hannah Schulz", "Parkallee 9", "0951 876 543", "Hannah.S@provider.com");
        Kursteilnehmer tn15 = new Kursteilnehmer("Lena Wolf", "Ringstrasse 44", "0721 321 654", "Lena.W@domain.com");
        Kursteilnehmer tn16 = new Kursteilnehmer("Niklas Hartmann", "Buchenweg 22", "0371 654 321", "Niklas.H@mail.net");
        Kursteilnehmer tn17 = new Kursteilnehmer("Mia Frank", "Heidestrasse 11", "0431 987 654", "Mia.F@example.org");
        Kursteilnehmer tn18 = new Kursteilnehmer("Tom Neumann", "Ziegelstrasse 5", "06131 876 543", "Tom.N@mail.de");
        Kursteilnehmer tn19 = new Kursteilnehmer("Elias Lehmann", "Brunnenstrasse 6", "06021 543 210", "Elias.L@mail.de");
        Trainer t1 = new Trainer("Hans Krankl", "Josefweg 123", "0123000230" , "h.krankl@gmail.com",22);
        Schulung java = new Schulung("JAVA",120,12,t1);
        Schulung cpp = new Schulung("C++",240,44,t1);



        java.kursteilnehmerHinzufuegen(tn1);
        java.kursteilnehmerHinzufuegen(tn2);
        java.kursteilnehmerHinzufuegen(tn3);
        java.kursteilnehmerHinzufuegen(tn4);
        java.kursteilnehmerHinzufuegen(tn5);
        java.kursteilnehmerHinzufuegen(tn6);
        java.kursteilnehmerHinzufuegen(tn7);
        java.kursteilnehmerHinzufuegen(tn8);
        java.kursteilnehmerHinzufuegen(tn9);
        java.kursteilnehmerHinzufuegen(tn10);
        java.kursteilnehmerHinzufuegen(tn11);
        java.kursteilnehmerHinzufuegen(tn12);
        java.kursteilnehmerHinzufuegen(tn13);
        java.kursteilnehmerHinzufuegen(tn14);
        java.kursteilnehmerHinzufuegen(tn15);
        java.kursteilnehmerHinzufuegen(tn16);
        java.kursteilnehmerHinzufuegen(tn17);
        java.kursteilnehmerHinzufuegen(tn18);
        java.kursteilnehmerHinzufuegen(tn19);

        cpp.kursteilnehmerHinzufuegen(tn1);
        cpp.kursteilnehmerHinzufuegen(tn2);
        cpp.kursteilnehmerHinzufuegen(tn3);
        cpp.kursteilnehmerHinzufuegen(tn4);
        cpp.kursteilnehmerHinzufuegen(tn5);
        cpp.kursteilnehmerHinzufuegen(tn6);
        cpp.kursteilnehmerHinzufuegen(tn7);
        cpp.kursteilnehmerHinzufuegen(tn8);

        Schulungsunternehmen ITSec = new Schulungsunternehmen();
        ITSec.setSchulung(java);
        ITSec.setSchulung(cpp);
        ITSec.drucken();
        System.out.println("Gesamtumsatz: " + ITSec.berechneGesamtUmsatz());
        System.out.println("Gesamtgewinn: " + ITSec.berechneGesamtGewinn());
    }
}
