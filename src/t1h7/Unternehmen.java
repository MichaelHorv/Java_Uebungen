package t1h7;

public class Unternehmen {
    Mitarbeiter[] ITSec = new Mitarbeiter[30];

    public boolean mitarbeiterAufnehmen(Mitarbeiter h){
        for (int i = 0; i < ITSec.length; i++){
            if (ITSec[i]!= null){
                ITSec[i] = h;
                return true;
            }
        }
        return false;
    }

//    public boolean mitarbeiterKuendigen(){
//        for (int i = 0;i < ITSec.length; i++){
//            if (ITSec.getClass().getSimpleName() == )
//        }
//
//    }
}
