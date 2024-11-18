package t1k3;

public class Kreis {
    private int radius;

    public int getRadius(){
        return radius;
    }

    public double flaeche(){
        return radius * radius * Math.PI;
    }

    public double umfang() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(int a) {
        radius = a;
    }
}
