package t1I3;
import java.util.Scanner;
public class T1I3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Einkaufswert eingeben: ");
        double i = Double.parseDouble(input.nextLine());
        double rabatt = 1;
        if(i >= 500){
            rabatt -= 0.2;
        }
        if(300 <= i && i < 500){
            rabatt -= 0.14;
        }
        if(200 <= i && i < 300){
            rabatt -= 0.08;
        }
        if(100 <= i && i < 200){
            rabatt -= 0.03;
        }
        System.out.println("Der Betrag beträgt: "+ i * rabatt);
    }
}
