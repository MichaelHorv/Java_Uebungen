package t1k7;

public class T1K7 {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(1, 10);
        Punkt punkt2 = new Punkt(1, 15);
        Strecke str = new Strecke(punkt1, punkt2);
        System.out.println(str.berechneLeange());
    }
}
