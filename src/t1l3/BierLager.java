package t1l3;

public class BierLager {
    private int lagerstand;

    public BierLager(int a) {
        lagerstand = a;
    }

    public int getLagerstand() {
        return lagerstand;
    }

    public boolean isEmpty() {
        return (lagerstand == 0);
    }

    public boolean kaufen(int a) {
        lagerstand -= a;
        return true;
    }
}
