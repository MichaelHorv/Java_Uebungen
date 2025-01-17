package t1h8;

public class Schulungsunternehmen {
    private int anzahl;
    Schulung[] sc = new Schulung[anzahl];

    public boolean setSchulung(Schulung a) {
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == null) {
                sc[i] = a;
                return true;
            }
        }
        return false;
    }


    public double berechneGesamtUmsatz() {
        double umsatz = 0;
        for (Schulung eineSchulung : sc){
            if (eineSchulung != null){
                umsatz += eineSchulung.berechneUmsatz();
            }
        }
        return umsatz;
    }

    public double berechneGesamtGewinn() {
        double gewinn = 0;
        for (Schulung eineSchulung : sc){
            if (eineSchulung != null){
                gewinn += eineSchulung.berechneGewinn();
            }
        }
        return gewinn;
    }


    public void drucken() {
        for (Schulung eineSchulung : sc) {
            if (eineSchulung != null) {
                eineSchulung.drucken();
            }
        }
    }
}
