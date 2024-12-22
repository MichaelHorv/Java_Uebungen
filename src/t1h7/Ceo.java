package t1h7;

public class Ceo extends Manager {
    private double optionen;

    public Ceo(int personalnummer, String name, String adresse, int eintrittsJahr, double stundenLohn, double bonus, double optionen) {
        super(personalnummer, name, adresse, eintrittsJahr, stundenLohn, bonus);
        this.optionen = optionen;
    }

    @Override
    public double berechneMonatsgehalt() {
        return super.berechneMonatsgehalt() + optionen;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Optionen: " + optionen);
    }
}
