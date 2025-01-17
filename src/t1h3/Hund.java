package t1h3;

public class Hund extends Haustier{

    public Hund(String name, String fellfarbe, int alter, String felltyp) {
        super(name, fellfarbe, alter, felltyp);
    }

    @Override
    public void gibLaut() {
        super.gibLaut();
        System.out.println("Wuff Wuff");
    }
}

