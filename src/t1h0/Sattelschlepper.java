package t1h0;

public class Sattelschlepper extends LKW{
    private double volumenLaderaum;

    public Sattelschlepper(int baujahr,String hersteller ,double volumenLaderaum){
        this.baujahr=baujahr;
        this.hersteller=hersteller;
        this.volumenLaderaum=volumenLaderaum;
    }

    public void drucken(){
        System.out.println("Baujahr: "+ baujahr);
        System.out.println("Hersteller: "+ hersteller);
        System.out.println("Laderraumvolumen: "+ volumenLaderaum);
    }
}
