package t1h3;

public abstract class Haustier extends Saeugetier {
    private String felltyp;

    public Haustier(String name, String fellfarbe, int alter, String felltyp) {
        super(name, fellfarbe, alter);
        this.felltyp = felltyp;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Felltyp: " + felltyp);
        System.out.println("-------------------------");
    }
}
