package ba.etf.unsa.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad,String broj) {
        if(null==grad) throw new BrojException("Pozivni broj za fiksni telefon nije uredu");
        this.grad=grad;
        this.broj=broj;
    }

    @Override
    public String ispisi() {
        if(grad!=null && broj!=null) {
            return grad.getPozivniBroj()+"/"+broj;
        }else{
            return null;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }
}
