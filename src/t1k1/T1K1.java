package t1k1;

public class T1K1 {
    public static void main(String [] args){
        MeinPC gamingstation = new MeinPC();
        if(gamingstation.isStatus()){
            System.out.println("PC ist an.");
        }
        else {
            System.out.println("PC ist aus.");
        }
        gamingstation.einschalten();
        if(gamingstation.einschalten()){
            System.out.println("PC wurde eingeschaltet.");
        }
        else{
            System.out.println("PC ist schon eingeschaltet.");
        }
        if(gamingstation.ausschalten()){
            System.out.println("PC wurde ausgeschaltet.");
        }
        else {
            System.out.println("PC ist schon ausgeschaltet.");
        }
        gamingstation.einschalten();
        if(gamingstation.isStatus()){
            System.out.println("PC ist an.");
        }
        else {
            System.out.println("PC ist aus.");
        }
    }
}
