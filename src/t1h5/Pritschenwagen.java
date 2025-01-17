package t1h5;

public class Pritschenwagen extends Kastenwagen{
    private boolean kippbar;

    String ja = "Ja";
    String nein = "Nein";
    public Pritschenwagen(String modellname, int leistung, int baujahr, double nutzlast, boolean kippbar) {
        super(modellname, leistung, baujahr, nutzlast);
        this.kippbar = kippbar;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Kippbar: " + kippbar);
        /*if (kippbar == true){
            System.out.println("Kippbar: Ja");
        } else {
            System.out.println("Kippbar: Nein");
        }*/
    }
}
