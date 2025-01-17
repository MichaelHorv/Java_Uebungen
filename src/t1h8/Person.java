package t1h8;

public abstract class Person {
    private String name;
    private String adresse;
    private String telnr;
    private String email;

    public Person(String name, String adresse, String telnr, String email) {
        this.name = name;
        this.adresse = adresse;
        this.telnr = telnr;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void drucken() {
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Telefonnummer: " + telnr);
        System.out.println("E-Mail: " + email);
    }
}
