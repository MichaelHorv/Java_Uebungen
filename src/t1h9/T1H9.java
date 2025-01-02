package t1h9;

public class T1H9 {
    public static void main(String[] args) {
        Bankkonto sparkonto = new Sparkonto("Hans Peter", 2022.33, 22.23);
        Bankkonto waehrungskonto = new Waehrungskonto("Jürgen Peters", 3450.23, 55.29, '$');
        Bankkonto girokonto = new Girokonto("Max Mustermann", 1254.23, 23, 23, 1500);

        sparkonto.drucken();
        waehrungskonto.drucken();
        girokonto.drucken();
    }
}
