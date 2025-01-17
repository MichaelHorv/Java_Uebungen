package t1h3;

public class Katze extends Haustier{

    public Katze(String name, String fellfarbe, int alter, String felltyp) {
        super(name, fellfarbe, alter, felltyp);
    }

    @Override
    public void gibLaut() {
        super.gibLaut();
        System.out.println("Miau Miau");
    }
}
