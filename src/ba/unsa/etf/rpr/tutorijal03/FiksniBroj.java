package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    private String broj;

    public enum Grad {
        Sarajevo("033"),
        Travnik("030"),
        Zenica("032"),
        Mostar("036"),
        Tuzla("035"),
        Bihać("037"),
        Goražde("038"),
        Orašje("031"),
        Livno("034"),
        ŠirokiBrijeg("039"),
        BRCKO("049");

        private final String pozivni;

        Grad(String pozivni) {
            this.pozivni = pozivni;
        }

        public String getPozivni() {
            return pozivni;
        }
    }


    public FiksniBroj(Grad grad, String broj) {
        this.broj = grad.getPozivni() + "/" + broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
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
