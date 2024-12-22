package t1h1;

public abstract class Hund {
    private String name;
    private int alter;
    private double gewicht;

    public Hund(String name, int alter, double gewicht) {
        super();
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }

    public double steuer() {
        return gewicht * 3.5;
    }

    public void drucken() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Gewicht: " + gewicht);
        System.out.format("Steuer: %.2f€\n", steuer());
    }
}
