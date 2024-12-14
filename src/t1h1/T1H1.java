package t1h1;

public class T1H1 {
    public static void main(String[] args) {
        Hund chuck = new Schosshund("Chuck", 12, 4.0);
        Hund fred = new Blindenhund("Fred", 6, 8.4);
        Hund ivan = new Kampfhund("Ivan", 5, 18.3);
        Hund rex = new Blindenhund("Rex", 4, 11.2);
        Hund rambo = new Kampfhund("Rambo", 5, 18.2);
        Hund klaus = new Schosshund("Klaus", 2, 6.2);

        Hundehuette hut = new Hundehuette();
        hut.drucken();
        hut.neuerHund(chuck);
        hut.neuerHund(fred);
        hut.neuerHund(ivan);
        hut.neuerHund(rex);
        hut.neuerHund(rambo);
        hut.neuerHund(klaus);
        hut.drucken();
    }
}
