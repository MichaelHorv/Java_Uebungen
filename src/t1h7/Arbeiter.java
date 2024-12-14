package t1h7;

public class Arbeiter extends Mitarbeiter {
    private double schichtzulage;

    public Arbeiter(int personalnummer, String name, String adresse, int eintrittsJahr, double stundenLohn, double schichtzulage) {
        super(personalnummer, name, adresse, eintrittsJahr, stundenLohn);
        this.schichtzulage = schichtzulage;
    }

    @Override
    public double berechneMonatsgehalt() {
        return super.berechneMonatsgehalt() + schichtzulage;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Schichtzulage: " + schichtzulage);
    }
}
