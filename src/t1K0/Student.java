package t1K0;

public class Student {
    //Instanzvariablen
    private String name;
    private String matrikelnummer;
    private String emailId;

    //Implementieren Sie für jede Instanzvariable eine Get und eine Set Methode. Legen Sie ein Studenten
    //Objekt an und geben Sie alle Details des Objektes auf der Konsole aus.
    //Getter für die Instanzvariable name
    public String getName() {
        return name;
    }
    //Setter für die Instanzvariable name
    public void setName(String n) {
        name = n;
    }
    //Getter für die Instanzvariable matrikelnummer
    public String getMatrikelnummer() {
        return matrikelnummer;
    }
    //Setter für die Instanzvariable matrikelnummer
    public void setMatrikelnummer(String n) {
        matrikelnummer = n;
    }
    //Getter für die Instanzvariable emailId
    public String getEmailId(){
        return emailId;
    }
    //Setter für die Instanzvariable emailId
    public void setEmailId(String n) {
        emailId = n;
    }
}
