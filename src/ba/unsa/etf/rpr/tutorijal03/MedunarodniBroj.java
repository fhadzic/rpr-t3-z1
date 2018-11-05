package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable {

    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {

        return (drzava + broj);
    }

    @Override
    public int compareTo(Object o){
        TelefonskiBroj o2 = (MedunarodniBroj) o;
        return ispisi().compareTo( o2.ispisi() );
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
