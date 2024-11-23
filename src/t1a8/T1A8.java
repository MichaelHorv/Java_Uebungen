package t1a8;
import java.util.Random;

public class T1A8 {
    public static void main(String[] args) {
        /*
        T1A8 – Lotto
        Implementieren Sie ein Programm, welches aus dem Bereich der Zahlen 1 bis 45 die 6 Lottozahlen und eine Zusatzzahl
        per Zufallszahlengenerator ermittelt. Stellen Sie sicher, dass dabei nur unterschiedliche Zahlen gezogen werden.
        Eine Zufallszahl zwischen 1 und 45 können Sie wie folgt ermitteln:
        Random rand = new Random();
        int i = rand.nextInt(45) + 1; // wiederholen Sie diese Zeile um eine neue Zufallszahl zu ermitteln
         */
        Random random = new Random();

        int[] lottoPlusZz = new int[7];

        for(int i = 0; i < lottoPlusZz.length;i++){
            lottoPlusZz[i] = random.nextInt(45) + 1;
            for(int j = 0; j < i; j++){
                if (lottoPlusZz[i] == lottoPlusZz[j]){
                  i--;
                  break;
                }
            }
        }


        for(int eineZahl : lottoPlusZz){
            System.out.println(eineZahl);
        }


    }
}
