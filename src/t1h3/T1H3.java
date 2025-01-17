package t1h3;

public class T1H3 {
    public static void main(String[] args) {
        Saeugetier s1 = new Hund("Fredi", "Grau", 23, "Kurzhaar");
        Saeugetier s2 = new Kuh("Milka", "Violett", 12, 20);
        Saeugetier s22 = new Kuh("Frieda", "Braun-Weiß", 11, 18);
        Saeugetier s3 = new Pferd("Hengst", "Braun", 4, 230.53);
        Saeugetier s4 = new Katze("Lucy", "Grau", 3, "Kurzhaar");

        Stall bauernhof = new Stall(12);

        bauernhof.tierHinzufuegen(s1);
        bauernhof.tierHinzufuegen(s2);
        bauernhof.tierHinzufuegen(s22);
        bauernhof.tierHinzufuegen(s3);
        bauernhof.tierHinzufuegen(s4);
        bauernhof.drucken();
        bauernhof.party();
        System.out.println("-----------------------------");
        bauernhof.tierEntfernen("Hengst");
        bauernhof.tierEntfernen("Lucy");
        bauernhof.drucken();
        bauernhof.party();

        bauernhof.statistik();

    }
}
