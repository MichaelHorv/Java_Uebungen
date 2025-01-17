package t1h5;

public class T1H5 {
    public static void main(String[] args) {
        Kraftfahrzeug limo = new Limousine("Porsche",224,2005,12);
        Kraftfahrzeug van = new Van("Mercedes",154,2028,8);
        Kraftfahrzeug pri = new Pritschenwagen("MAN",280,2020,1,true);
        Kraftfahrzeug cab = new Cabrio("Ford Mustang",120,2023,1,7);
        Kraftfahrzeug kw = new Kastenwagen("Citroen",90,2018,192);

        /*van.drucken();
        pri.drucken();
        limo.drucken();
        cab.drucken();
        kw.drucken();*/

        Garage g = new Garage(2);

        System.out.println(g.fahrzeugHinzufuegen(limo) ? "true" : "false");
        System.out.println(g.fahrzeugHinzufuegen(van) ? "true" : "false");
        g.drucken();
    }
}
