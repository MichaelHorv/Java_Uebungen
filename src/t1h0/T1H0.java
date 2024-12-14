package t1h0;

public class T1H0 {
    public static void main(String[] args) {
        LKW lke = new LKW(2023, "HANSI");
        lke.drucken();
        Sattelschlepper ss = new Sattelschlepper(1998, "Mercedes", 1250);
        ss.drucken();
        Muldenkipper mk = new Muldenkipper(2020, "MAN", 1865);
        mk.drucken();
    }
}
