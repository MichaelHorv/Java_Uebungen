package t1k9;

import java.util.Random;

public class T1K9 {
    public static void main(String[] args) {
        WuerfelMax spiel = new WuerfelMax("Max", new Random());
        for (int i=0; i < 1; i++) {
            System.out.println("FOR");
        }
        int i=0;
        while(i <= 5){
            System.out.println("WHILE");
            i++;
            if (i==3){
                break;
            }
        }
        i=0;
        do {
            i++;
            System.out.println("DO");
        } while (i <=3);

    }
}
