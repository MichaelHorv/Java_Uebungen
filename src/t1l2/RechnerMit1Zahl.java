package t1l2;

public class RechnerMit1Zahl {
    private int zahl;

    public RechnerMit1Zahl(int a){
        zahl = a;
    }
    public void collatz(){
        int z = zahl;
        while(z != 1) {
            if (z % 2 == 0) {
                z /= 2;
            } else {
                z = z * 3 + 1;
            }
            System.out.println(z);
            }
    }
    public long fakultaet(){
        long ergebnis = 1;
        for(int i = zahl; i > 0; i--){
        ergebnis *= i;
        }
        return ergebnis;
    }
}
