package t1h9;

public class Sparkonto extends Bankkonto{
    public Sparkonto(String kontoinhaber, double saldo, double habenzinsen){
        super(kontoinhaber, saldo, habenzinsen);
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("----------------------------------");
    }
}
