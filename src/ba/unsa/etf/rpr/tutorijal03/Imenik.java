package ba.unsa.etf.rpr.tutorijal03;


public class Imenik {

    private Map<String, TelefonskiBroj> hashPoImenu = new HashMap<>();
    private Map<TelefonskiBroj, String> hashPoTelefonskomBroju = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        hashPoImenu.put(ime, broj);
        hashPoTelefonskomBroju.put(broj, ime);
    }
}
