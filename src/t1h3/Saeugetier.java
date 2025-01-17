package t1h3;

public abstract class Saeugetier {
    private int alter;
    private String fellfarbe;
    private String name;

    public Saeugetier(String name, String fellfarbe, int alter) {
        this.name = name;
        this.fellfarbe = fellfarbe;
        this.alter = alter;
    }
    public String getName(){
        return name;
    }
    public void gibLaut(){
    }

    public void drucken() {
        System.out.println("-------------------------");
        System.out.println("Tier: " + this.getClass().getSimpleName());
        System.out.println("Name: " + this.name);
        System.out.println("Alter: " + this.alter);
        System.out.println("Fellfarbe: " + this.fellfarbe);

    }
}
