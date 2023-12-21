package ba.unsa.etf.rpr.t7z1;

import javafx.beans.Observable;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    final private SimpleObjectProperty<Korisnik> trenutni= new SimpleObjectProperty<>();

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutni() {
        return trenutni.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniProperty() {
        return trenutni;
    }

    public void setTrenutni(Korisnik trenutni) {
        this.trenutni.set(trenutni);
    }

    public void napuni() {
        korisnici.add(new Korisnik("Benjamin","Bazdar","dzombi@bmail.com","dzombi","1234"));
        korisnici.add(new Korisnik("Ensar","Hodzic","ginger@bmail.com","ginger","4321"));
        korisnici.add(new Korisnik("Kreco","Hakija","cakija@bmail.com","cakija","1111"));
        korisnici.add(new Korisnik("Saban","Saulic","sabo@bmail.com","sabo","4444"));
        trenutni.set(null);
    }

    public void dodajKorisnika(Korisnik k){
        korisnici.add(k);
        setTrenutni(k);
    }
}
