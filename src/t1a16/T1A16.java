package t1a16;

public class T1A16 {
    public static void main(String[] args) {
        System.out.println(join("+", "Gestern", "war", "ein", "schöner", "Tag."));
        System.out.println(join("+", "Stefan", "hat", "ein", "schönes", "Jackerl", "an."));
    }

    private static String join(String trennzeichen, String... worte) {
        String s = "";
        for (int i = 0; i < worte.length; i++) {
            if (s.length() > 0) {
                s += trennzeichen;
            }
            s += worte[i];
        }
        return s;
    }
}
