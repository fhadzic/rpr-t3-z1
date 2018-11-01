package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Map;

public class Imenik {

    private Map<String, TelefonskiBroj> hashPoImenu = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        hashPoImenu.put(ime, broj);
    }

    public String dajBroj(String ime){
        return hashPoImenu.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        String ime;
        for( Map.Entry<String, TelefonskiBroj> el : hashPoImenu.entrySet() ){
            if(el.getValue() == broj ){
                ime = el.getKey();
                break;
            }
        }
        return ime;
    }

    public String naSlovo(char s){
        for( Map.Entry<String, TelefonskiBroj> el : hashPoImenu.entrySet() ){
            String key = el.getKey();
            if(key.charAt(0) == s){
                 = key;
                break;
            }
        }
    }

}
