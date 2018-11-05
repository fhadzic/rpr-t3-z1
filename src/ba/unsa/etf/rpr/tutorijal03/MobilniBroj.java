package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj implements Comparable{

    int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = String.format("0%d/%s", mobilnaMreza, broj);
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int compareTo(Object o){
        TelefonskiBroj o2 = (MobilniBroj) o;
        return ispisi().compareTo( o2.ispisi() );
    }

    @Override
    public int hashCode(){
        return 0;
    }

}
