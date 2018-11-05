package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements Comparable {

    private String broj;

    public enum Grad {
        SARAJEVO("033"),
        TRAVNIK("030"),
        ZENICA("032"),
        MOSTAR("036"),
        TUZLA("035"),
        BIHAC("037"),
        GORAZDE("038"),
        ORASJE("031"),
        LIVNO("034"),
        SIROKIBRIJEG("039"),
        BRCKO("049");

        private final String pozivni;

        Grad(String pozivni) {
            this.pozivni = pozivni;
        }

        public String getPozivni() {
            return pozivni;
        }
    }

    private Grad g;


    public FiksniBroj(Grad grad, String broj) {
        this.broj = grad.getPozivni() + "/" + broj;
        this.g = grad;
    }

    public Grad getGrad(){
        return g;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public int compareTo(Object o){
        TelefonskiBroj o2 = (FiksniBroj) o;
        return ispisi().compareTo( o2.ispisi() );
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
