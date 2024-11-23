package t1a5;

public class T1A5 {
    public static void main(String[] args) {
        int[] fibo = new int[30];
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int eineZahl : fibo){
            System.out.println(eineZahl);
        }
    }

}
