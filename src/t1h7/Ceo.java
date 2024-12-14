package t1h7;

public class Ceo extends Mitarbeiter {
    private double optionen;
    public double bonus;

    public Ceo(int personalnummer, String name, String adresse, int eintrittsJahr, double stundenLohn, double bonus, double optionen) {
        super(personalnummer, name, adresse, eintrittsJahr, stundenLohn);
        this.bonus = bonus;
        this.optionen = optionen;
    }

    @Override
    public double berechneMonatsgehalt() {
        return super.berechneMonatsgehalt() + optionen + bonus;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Optionen: " + optionen);
        System.out.println("Bonus: " + bonus);
    }
}
