package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj {

    enum Grad {
        Sarajevo,
        Travnik,
        Zenica,
        Mostar,
        Tuzla,
        Bihać,
        Goražde,
        Orašje,
        Livno,
        ŠirokiBrijeg,
        BRCKO
    }

    String broj;

    public FiksniBroj(Grad grad, String broj) {
        if (grad == Grad.Sarajevo) {
            broj = "033/" + broj;
        } else if (grad == Grad.Travnik) {
            broj = "030/" + broj;
        } else if (grad == Grad.Zenica) {
            broj = "032/" + broj;
        } else if (grad == Grad.Mostar) {
            broj = "036/" + broj;
        } else if (grad == Grad.Tuzla) {
            broj = "035/" + broj;
        } else if (grad == Grad.Bihać) {
            broj = "037/" + broj;
        } else if (grad == Grad.Goražde) {
            broj = "038/" + broj;
        } else if (grad == Grad.Orašje) {
            broj = "031/" + broj;
        } else if (grad == Grad.Livno) {
            broj = "034/" + broj;
        } else if (grad == Grad.ŠirokiBrijeg) {
            broj = "039/" + broj;
        } else if (grad == Grad.BRCKO) {
            broj = "049/" + broj;
        }
        this.broj = broj;
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
}
