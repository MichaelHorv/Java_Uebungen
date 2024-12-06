package t1a11;

public class Rechnung {
    private RechnungZeile[] zeilen;

    public Rechnung(int anzahlZeilen){
        zeilen = new RechnungZeile[anzahlZeilen];
    }

    public void drucken(){
        double gesamtSumme = 0;
        for (RechnungZeile eineRechnungZeile : zeilen){
            if(eineRechnungZeile != null) {
                eineRechnungZeile.drucken();
                gesamtSumme += eineRechnungZeile.berechneZeilenPreis();
            }
        }
        System.out.format("Der Gesamtpreis beträgt: %.2f€", gesamtSumme);

    }

    public boolean neueWare(int anzahlStueck, Ware ware){
        for(int i = 0;i < zeilen.length;i++){
            if (zeilen[i] == null){
                zeilen[i] = new RechnungZeile(anzahlStueck, ware);
                return true;
            }
        }
        return false;
    }
}
