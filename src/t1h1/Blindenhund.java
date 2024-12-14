package t1h1;

public class Blindenhund extends Hund {

    public Blindenhund(String name, int alter, double gewicht) {
        super(name, alter, gewicht);
    }

    @Override
    public double steuer() {
        return super.steuer() * 0.1;
    }
}
