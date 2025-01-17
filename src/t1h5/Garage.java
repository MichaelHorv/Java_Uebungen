package t1h5;

public class Garage {
    private Kraftfahrzeug[] garage;

    public Garage(int anzahlMax) {
        this.garage = new Kraftfahrzeug[anzahlMax];
    }

    public boolean fahrzeugHinzufuegen(Kraftfahrzeug auto){
        for (int i = 0; i < garage.length; i++){
            if (garage[i] == null){
                garage[i] = auto;
                return true;
            }
        }
        return false;
    }

    public void drucken(){
        for (Kraftfahrzeug einAuto : garage){
            if (einAuto != null){
                einAuto.drucken();
            }
        }

    }

}
