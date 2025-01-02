package t1a1;

import java.time.Year;

public class Pulsfrequenz {
    private int gdJahr;
    private String nachname;
    private String vorname;

    public Pulsfrequenz(String vorname, String nachname, int gdJahr) {
        this.gdJahr = gdJahr;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public void drucken() {
        System.out.println(vorname + " " + nachname + " geboren im Jahr " + gdJahr);
        System.out.println("Maximale Pulsfrequenz " + maxFrequenz());
        int[] zfm = zielFrequenz();
        System.out.println("Zielfrequenz von " + zfm[0] + " bis " + zfm[1]);
    }

    public int maxFrequenz() {

        return (int) (223 - (Year.now().getValue() - gdJahr) * 0.9);
    }

    public int[] zielFrequenz() {
        //Array deklarieren, um in der richtigen größe anlegen.
        int[] zf = new int[2];
        int mf = maxFrequenz();
        zf[0] = (int) (mf * 0.5);
        zf[1] = (int) (mf * 0.85);
        return zf;
    }
}
