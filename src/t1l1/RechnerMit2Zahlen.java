package t1l1;

public class RechnerMit2Zahlen {
    private int zahl1;
    private int zahl2;

    public RechnerMit2Zahlen(int zahl1, int zahl2){
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }
    public void multiplizieren(){
        /*
        zahl1   zahl2
        7       3
        7 + 7 + 7
         */
        int ergebnis=0;
        for (int i= 1; i <= zahl2; i++){
            ergebnis += zahl1;
        }
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }


    public void dividieren(){
        /*
        zahl1   zahl2
        7       3
        4
        1
         */
        int z1= zahl1;
        int ergebnis=0;
        while(z1 >= zahl2){
            z1 -= zahl2;
            ergebnis++;
        }
        System.out.println("Das Ergebnis ist: " + ergebnis + " mit dem Rest: " + z1);    }

    public void ggt(){
        /*
        zahl1   zahl2
        14      4
        10
        6
        2
                2
        2       2
         */
        int z1 =zahl1;
        int z2 = zahl2;

        while(z1 != z2){
            if(z1 > z2){
                z1 -= z2;
            }else {
                z2 -= z1;
            }
        }
        System.out.println("Der größte gemeinsame Teiler ist: " + z1);
    }
}
