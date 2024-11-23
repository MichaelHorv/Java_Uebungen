package t1a4;

public class T1A4 {
    public static void main(String[] args) {
        Kurs java = new Kurs("Java",256);
        java.stornieren("Alex");
        java.aufnehmen("Hansi");
        java.aufnehmen("Franz");
        java.aufnehmen("Fredl");
        java.aufnehmen("John");
        java.aufnehmen("James");
        java.aufnehmen("Onusch");
        java.aufnehmen("Janosch");
        java.aufnehmen("Leopold");
        java.aufnehmen("Hannes");
        java.aufnehmen("Georg");
        java.aufnehmen("Peter");
        java.stornieren("Hansi");
        java.aufnehmen("Peta");
        java.stornieren("Fredl");
        java.drucken();
    }
}
