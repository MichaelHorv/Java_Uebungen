package abschlusspruefung;

public abstract class Produkte {
    private String artikelId;
    private String bezeichnung;
    private double einkaufspreis;

    public Produkte(String artikelId, String bezeichnung, double einkaufspreis) {
        this.artikelId = artikelId;
        this.bezeichnung = bezeichnung;
        this.einkaufspreis = einkaufspreis;
    }


    public double getEinkaufspreis() {
        return einkaufspreis;
    }

    public void setEinkaufspreis(double einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }


    public String getArtikelId() {
        return artikelId;
    }


    public double verkaufspreis() {
        return this.einkaufspreis * 1.05;
    }

    public void drucken(){
        System.out.println("------"+this.getClass().getSimpleName()+"------");
        System.out.println("ArtikelID: " + artikelId);
        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.format("Einkaufspreis: %.2f€\n", einkaufspreis);
        System.out.format("Verkaufspreis: %.2f€\n", verkaufspreis());
    }
}
