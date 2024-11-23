package t1a15;

public class T1A15 {
    public static void main(String[] args) {
        /*Implementieren Sie ein Programm zur Berechnung der Zahlen von 1*1 bis 12*12.
        Verwenden Sie für die Speicherung der Zahlen ein int[][] Array. Geben Sie die Tabelle auf der Konsole aus
        */
        //Array für Zeilen und Array für Spalten erstellen. (Matrix)
        int[][] tafel = new int[12][12];

        for (int i = 0; i < tafel.length; i++) {
            for (int j = 0; j < tafel[i].length; j++) {
                tafel[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] eineZeile : tafel) {
            for (int eineZahl : eineZeile) {
                System.out.format("%4d",eineZahl );
            }
            System.out.println();
        }
    }
}
