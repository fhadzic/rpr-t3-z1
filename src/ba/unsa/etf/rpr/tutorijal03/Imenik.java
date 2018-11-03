package ba.unsa.etf.rpr.tutorijal03;



import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.*;

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
        String temp;
        int i = 1;
        for( Map.Entry<String, TelefonskiBroj> el : hashPoImenu.entrySet() ) {
            temp = el.getKey();
            if(temp.charAt(0) == s){
                temp += i + ". " + el.getKey() + "-" + el.getValue().ispisi()+"\n";
                i++;
            }
        }
        return temp;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> result = new TreeSet<>();
        Iterator<Map.Entry<String, TelefonskiBroj>> it = hashPoImenu.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, TelefonskiBroj> pair = (Map.Entry<String, TelefonskiBroj>) it.next();
            if(pair.getValue() instanceof FiksniBroj && ((FiksniBroj) pair.getValue()).getGrad().equals(g))
                result.add(pair.getKey());
        }
        return result;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> result = new TreeSet<>();
        Iterator<Map.Entry<String, TelefonskiBroj>> it = hashPoImenu.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, TelefonskiBroj> pair = (Map.Entry<String, TelefonskiBroj>) it.next();
            if(pair.getValue() instanceof FiksniBroj && ((FiksniBroj) pair.getValue()).getGrad().equals(g))
                result.add(pair.getValue());
        }
        return result;
    }

    }

}
