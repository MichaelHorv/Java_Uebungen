package t1h0;

public class Muldenkipper extends LKW {
    private double tonnenBeladung;

    public Muldenkipper(int baujahr, String hersteller, double tonnenBeladung) {
        super(baujahr, hersteller);
        this.tonnenBeladung = tonnenBeladung;
    }

    @Override
    public void drucken() {
        System.out.println("Muldenkipper");
        super.drucken();
        System.out.println("Beladung in tonnen:" + tonnenBeladung);
    }
}
