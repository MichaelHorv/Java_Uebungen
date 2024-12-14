package t1h7;

public class Manager extends Mitarbeiter {
    private double bonus;

    public Manager(int personalnummer, String name, String adresse, int eintrittsJahr, double stundenLohn, double bonus) {
        super(personalnummer, name, adresse, eintrittsJahr, stundenLohn);
        this.bonus = bonus;
    }


    @Override
    public double berechneMonatsgehalt() {
        return super.berechneMonatsgehalt() + bonus;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Bonus: " + bonus);
    }
}
