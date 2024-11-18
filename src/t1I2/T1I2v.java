package t1I2;
import java.util.Scanner;

public class T1I2v {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ist das Mitglied verheiratet? y/n");
        char j = input.nextLine().charAt(0);
        System.out.println("Ist das Mitglied ein Student? y/n");
        char i = input.nextLine().charAt(0);
        input.close();
        int betrag = 500;
        if(j == 'y'||j == 'Y') {
            betrag = betrag - 100;
        }
        if(i=='y'||j == 'Y'){
            betrag -= 200;
        }
        System.out.println("Das Mitglied bezahlt: " + betrag);
    }
}