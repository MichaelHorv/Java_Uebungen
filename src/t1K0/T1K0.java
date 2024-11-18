package t1K0;
//Wenn sich die Klasse im gleichen Package befindet. Muss die Klasse nicht extra importiert werden.
public class T1K0 {
    public static void main(String[] args){
        Student xy = new Student();
        xy.setName("Hansi Hinterseer");
        xy.setMatrikelnummer("BITI 24 4712");
        xy.setEmailId("hansi.hinterseer@hochschule-burgenland.at");
        System.out.println("Der Name des Studenten ist " + xy.getName());
        System.out.println("Die Matrikelnummer ist: " + xy.getMatrikelnummer());
        System.out.println("Und die Email Adresse ist: " + xy.getEmailId());


        Student mm = new Student();
        mm.setName("Max Mustermann");
        mm.setMatrikelnummer("BITI 24 4565");
        mm.setEmailId("max.mustermann@hochschule-burgenland.at");
        System.out.println("Der Name des Studenten ist " + mm.getName());
        System.out.println("Die Matrikelnummer ist: " + mm.getMatrikelnummer());
        System.out.println("Und die Email Adresse ist: " + mm.getEmailId());
    }
}
