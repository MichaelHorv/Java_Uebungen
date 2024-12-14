package t1h1;

public class Kampfhund extends Hund {

    public Kampfhund(String name, int alter, double gewicht) {
        super(name, alter, gewicht);
    }

    @Override
    public double steuer() {
        return super.steuer() * 4;
    }
}
