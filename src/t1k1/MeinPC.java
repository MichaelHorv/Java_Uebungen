package t1k1;

public class MeinPC {
    private boolean status;

    public boolean einschalten(){
        if (status) {
            return false;
        }
        else {
            status = true;
            return true;
        }
    }
    public boolean ausschalten(){
        if (!status) {
            return false;
        }
        else {
            status = false;
            return true;
        }
    }
    public boolean isStatus(){
        return status;
    }
}
