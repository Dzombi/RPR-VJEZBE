package ba.unsa.etf.rpr;

public class Korisnik extends Osoba{
    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }

    private Racun racun;

    public void dodajRacun(Racun racun){this.racun=racun;}
}
