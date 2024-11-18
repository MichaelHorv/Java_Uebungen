package t1k9;
import java.util.Random;

public class WuerfelMax {

    //Instanzvariablen
    private int count;
    private String name;
    private Random random;


    //Konstruktor
    public WuerfelMax(String name, Random random){
        //setzt konkrete Werte in die Instanzvariablen
        this.name = name;
        this.random = random;
    }
    //Methode
    public void wuerfeln(){
        int w1 = random.nextInt(1,7);
        int w2 = random.nextInt(1,7);
        //Augen 1 und 2: 1000 Punkte
        //gleiche Augenzahl: Augenzahl * 100 Punkte
        //sonst: größere Augenzahl * 10 + kleinere Augenzahl
        
        if ((w1 == 1 && w2 == 2)||(w1 == 2 && w2 == 1)) {
            count += 1000;
        } else if (w1 == w2) {
            count += w1 * 100;
        } else{

            count += Math.max(w1, w2) * 10 + Math.min(w1, w2);
        }
        System.out.println("Würfel 1: " + w1 +" Würfel 2: " + w2 + " Spielstand: " + count);}

}
