package t1k3;
import java.util.Scanner;

public class T1K3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte den Radius als ganze Zahl eingeben: ");
        int radius = Integer.parseInt(in.nextLine());
        System.out.println("Welche Einheit wird verwendet? 1= mm, 2= cm, 3=m");
        int einheit = Integer.parseInt(in.nextLine());
        in.close();
        String sEinheit = null;
        if(einheit == 1){
            sEinheit = "mm";
        } else if (einheit == 2) {
            sEinheit = "cm";
        } else if (einheit == 3) {
            sEinheit = "m";
        }

        Kreis k = new Kreis();
        k.setRadius(radius);
        System.out.println("Die Radius beträgt: " + k.getRadius() + sEinheit);
        System.out.format("Die Fläche beträgt: %.2f%s²\n", k.flaeche(), sEinheit);
        System.out.format("Der Umfang beträgt: %.2f%s", + k.umfang(), sEinheit);

    }
}
