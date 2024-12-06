package t1k8;

public class T1K8 {
    public static void main(String[] args) {
        Intervall test = new Intervall(5,8);

        if (test.contains(9)){
            System.out.println("Enhalten");
        } else{
            System.out.println("Nicht enthalten");
        }
    }
}
