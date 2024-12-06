package t1k8;

public class Intervall {
    private int lowerBound;
    private int upperBound;

    public Intervall(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean contains(int a) {
        if (a > upperBound || a < lowerBound) {
            return false;
        } else
            return true;
    }
}
