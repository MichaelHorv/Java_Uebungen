package t1a11;

public class Ware {
    private String artikelBezeichnung;
    private String artikelNummer;
    private double preis;

    public Ware(String artikelBezeichnung, String artikelNummer, double preis) {
        this.artikelBezeichnung = artikelBezeichnung;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
    }

    public void drucken() {
        System.out.println("Artikelbezeichnung: " + artikelBezeichnung + " Artikelnummer: " + artikelNummer + " zum Preis von: " + preis + "€");
    }
    public String getArtikelBezeichnung(){
        return artikelBezeichnung;
    }

    public String getArtikelNummer(){
        return artikelNummer;
    }

    public double getPreis(){
        return preis;
    }



}
