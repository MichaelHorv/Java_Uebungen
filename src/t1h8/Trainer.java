package t1h8;

public class Trainer extends Person {
    private double tagsatz;

    public Trainer(String name, String adresse, String telnr, String email, double tagsatz) {
        super(name, adresse, telnr, email);
        this.tagsatz = tagsatz;
    }


    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Tagsatz: " + tagsatz);
    }

    public double getTagsatz(){
        return tagsatz;
    }
}
