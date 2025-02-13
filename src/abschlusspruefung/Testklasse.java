package abschlusspruefung;

public class Testklasse {
    public static void main(String[] args) {
        Produkte waschmaschine = new Elektrogeraet("1w232","Bosch Waschmaschine", 450.45,'F');
        Produkte ritterburg = new Spielzeug("88uz26","Ritterburg Schlaining", 127.20,12);
        Produkte apfel = new Lebensmittel("0292j2","Apfel Grün", 0.20,false);
        Produkte weiswein = new Lebensmittel("1123jj2","Weißwein Kellermeisterei Umathum", 10.86,true);
        Produkte milchbroetchen = new Lebensmittel("92j28ww","Milchbrötchen Ölz", 3.50,false);
        Produkte tv = new Elektrogeraet("909wk76575h","TV Samsung 65Zoll", 450.98,'C');
        Produkte modelleisenbahn = new Spielzeug("llfjfhr33","Modelleisenbahn", 234.99,14);

        Supermarkt merkur = new Supermarkt(6);

        if (merkur.produktAufnehmen(waschmaschine)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(ritterburg)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(apfel)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(weiswein)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(milchbroetchen)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(tv)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }
        if (merkur.produktAufnehmen(modelleisenbahn)){
            System.out.println("Artikel aufgenommen.");
        } else {
            System.out.println("Kein freier Platz für weiteren Artikel.");
        }

        merkur.drucken();

        //TV entfernen
        if (merkur.produktVerkaufen("909wk76575h")){
            System.out.println("Produkt wurde aus dem Sortiment entfernt.");
        } else {
            System.out.println("Produkt wurde nicht gefunden oder befindet sich nicht im Sortiment.");
        }

        //Apfel entfernen
        if (merkur.produktVerkaufen("0292j2")){
            System.out.println("Produkt wurde aus dem Sortiment entfernt.");
        } else {
            System.out.println("Produkt wurde nicht gefunden oder befindet sich nicht im Sortiment.");
        }

        //Waschmaschine entfernen
        if (merkur.produktVerkaufen("1w232")){
            System.out.println("Produkt wurde aus dem Sortiment entfernt.");
        } else {
            System.out.println("Produkt wurde nicht gefunden oder befindet sich nicht im Sortiment.");
        }

        //nicht vorhandenen Artikel entfernen
        if (merkur.produktVerkaufen("abcdefg")){
            System.out.println("Produkt wurde aus dem Sortiment entfernt.");
        } else {
            System.out.println("Produkt wurde nicht gefunden oder befindet sich nicht im Sortiment.");
        }
        
        merkur.drucken();
        merkur.sonderangebot("88uz26",50);
        merkur.drucken();
    }
}
