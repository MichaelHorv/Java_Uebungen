package arraytest;

public class Arraytest {
    public static void main(String[] args) {
    /*
    for each =
    */
        int[] iArray = {1, 2, 3, 4, 5};

        for (int i : iArray) {
            System.out.println(i);
            if (i % 2 == 1) {
                System.out.println("ungerade");
            } else {
                System.out.println("gerade");
            }
        }
    }
}
