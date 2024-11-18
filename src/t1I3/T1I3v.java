package t1I3;
import java.util.Scanner;

public class T1I3v {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Einkaufswert eingeben: ");
        double i = Double.parseDouble(input.nextLine());
        int rabatt = 0;
        if(i >= 500){
            rabatt = 20;
        }
        else if(300<= i){
            rabatt = 14;
        }
        else if(200<= i){
            rabatt = 8;
        }
        else if(100<= i){
            rabatt = 3;
        }
        System.out.println("Der Preis beträgt: " + (i-( i * (double)100 / rabatt)));
    }
}
