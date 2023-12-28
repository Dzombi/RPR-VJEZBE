package ba.unsa.etf.rpr.t7z1;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private ListView list;
    @FXML
    private TextField ime;
    @FXML
    private TextField prezime;
    @FXML
    private TextField email;
    @FXML
    private TextField username;
    @FXML
    private TextField lozinka;

    private KorisniciModel model= new KorisniciModel();

    public Controller() {
        model.napuni();
    }

    @FXML
    public void initialize() {
        list.setItems(model.getKorisnici());
        model.trenutniProperty().addListener((obs,oldKorisnik,newKorisnik)->{
            if(oldKorisnik!=null){
                ime.textProperty().unbindBidirectional(oldKorisnik.imeProperty());
                prezime.textProperty().unbindBidirectional(oldKorisnik.prezimeProperty());
                username.textProperty().unbindBidirectional(oldKorisnik.usernameProperty());
                email.textProperty().unbindBidirectional(oldKorisnik.emailProperty());
                lozinka.textProperty().unbindBidirectional(oldKorisnik.lozinkaProperty());
            }
                ime.textProperty().bindBidirectional(newKorisnik.imeProperty());
                prezime.textProperty().bindBidirectional(newKorisnik.prezimeProperty());
                username.textProperty().bindBidirectional(newKorisnik.usernameProperty());
                email.textProperty().bindBidirectional(newKorisnik.emailProperty());
                lozinka.textProperty().bindBidirectional(newKorisnik.lozinkaProperty());

        });
        Korisnik novi=new Korisnik();
        model.getKorisnici().add(novi);
        model.setTrenutni(novi);
    }

    public void promjenaKorisnika(javafx.scene.input.MouseEvent mouseEvent) {
        Korisnik k= (Korisnik) list.getSelectionModel().getSelectedItem();
        model.setTrenutni(k);
    }

    public void dodaj(MouseEvent actionEvent) {
        Korisnik novi=new Korisnik();
        model.getKorisnici().add(novi);
        model.setTrenutni(novi);
        list.refresh();
    }

    public void kraj(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(0);
    }
}