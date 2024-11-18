package t1k4;

public class Sparbuch {
    private double guthaben;

    public Sparbuch(double guthaben){
        this.guthaben = guthaben;
    }

    public void einzahlen(double a){
        this.guthaben += a;
    }
    public double getGuthaben(){
        return guthaben;
    }

    public double endKapitalBerechnen(int laufzeit, double zinssatz){
        return guthaben * Math.pow((1+(zinssatz/100)),laufzeit);
    }
}
