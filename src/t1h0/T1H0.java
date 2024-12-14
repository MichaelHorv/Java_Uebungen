package t1h0;

public class T1H0 {
    public static void main(String[] args) {

        Sattelschlepper ss = new Sattelschlepper(1998, "Mercedes", 1250);
        ss.drucken();

        Muldenkipper mk = new Muldenkipper(2020, "MAN", 1865);
        mk.drucken();


        LKW[] fuhrpark = {ss, mk};
        System.out.println("\n Mein Fuhrpark");
        for (LKW einLKW: fuhrpark){
            einLKW.drucken();
        }
    }
}
