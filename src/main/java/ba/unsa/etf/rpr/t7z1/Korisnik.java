package ba.unsa.etf.rpr.t7z1;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime;
    private SimpleStringProperty prezime;
    private SimpleStringProperty email;
    private SimpleStringProperty username;
    private SimpleStringProperty lozinka;

    public Korisnik(String ime, String prezime, String email, String username, String lozinka) {
        this.ime =new SimpleStringProperty(ime);
        this.prezime =new SimpleStringProperty(prezime);
        this.email = new SimpleStringProperty(email);
        this.username = new SimpleStringProperty(username);
        this.lozinka = new SimpleStringProperty(lozinka);
    }

    public Korisnik() {
        this.ime =new SimpleStringProperty("");
        this.prezime =new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.username = new SimpleStringProperty("");
        this.lozinka = new SimpleStringProperty("");
    }

    @Override
    public String toString() {
        String s=getPrezime()+" "+getIme();
        return s;
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getUsername() {
        return username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getLozinka() {
        return lozinka.get();
    }

    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka.set(lozinka);
    }
}
