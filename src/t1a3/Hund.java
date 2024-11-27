package t1a3;

public class Hund {
    //Instanzvariablen name und alter
    private String name;
    private int alter;

    //Konstruktor für die Klasse Hund
    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    //bellen funktion erstellen mit der Ausgabe name + alter und "bellt"
    public void bellen() {
        System.out.println(name + " ist " + alter + " Jahre alt und bellt gerade: Wuff Wuff");
    }
}
