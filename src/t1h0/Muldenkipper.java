package t1h0;

public class Muldenkipper extends LKW {
    private double tonnenBeladung;

    public Muldenkipper(int baujahr,String hersteller ,double tonnenBeladung){
        this.baujahr = baujahr;
        this.hersteller = hersteller;
        this.tonnenBeladung = tonnenBeladung;
    }

    public void drucken(){
        System.out.println("Baujahr:" + baujahr);
        System.out.println("Hersteller:" + hersteller);
        System.out.println("Beladung in tonnen:" + tonnenBeladung);
    }
}
