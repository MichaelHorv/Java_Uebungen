package t1h7;

public abstract class Mitarbeiter {
    private int personalnummer;
    private String name;
    private String adresse;
    private int eintrittsJahr;
    private double stundenLohn;

    public Mitarbeiter(int personalnummer, String name, String adresse, int eintrittsJahr, double stundenLohn){
        this.personalnummer = personalnummer;
        this.name = name;
        this.adresse = adresse;
        this.eintrittsJahr = eintrittsJahr;
        this.stundenLohn = stundenLohn;
    }

    public int getPersonalnummer(){
        return personalnummer;
    }

    public double berechneMonatsgehalt(){
        return stundenLohn*154;
    }

    public void drucken(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Personalnummer: " + personalnummer);
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Eintrittsjahr: " + eintrittsJahr);
        System.out.println("Stundenlohn: " + stundenLohn);
        System.out.println("Monatsgehalt: " + berechneMonatsgehalt());
    }



}
