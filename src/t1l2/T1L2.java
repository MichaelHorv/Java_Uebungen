package t1l2;

public class T1L2 {
    public static void main(String[] args) {
        RechnerMit1Zahl test = new RechnerMit1Zahl(5);
        System.out.println("Fakultät: " + test.fakultaet());
        test.collatz();

        RechnerMit1Zahl test2 = new RechnerMit1Zahl(0);
        System.out.println("Fakultät: " + test2.fakultaet());
        test2.collatz();
    }
}
