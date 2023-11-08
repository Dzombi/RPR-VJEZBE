package ba.etf.unsa.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ImenikTest {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Jusuf", new FiksniBroj(Grad.SARAJEVO, "333-444"));
        imenik.dodaj("Ramo", new FiksniBroj(Grad.ZENICA, "555-444"));
        imenik.dodaj("Denis", new MobilniBroj(61, "666-444"));
        imenik.dodaj("Oliver", new MedunarodniBroj("+44", "1234566666"));
    }

    @Test
    public void dajBrojIma() {
        String broj = imenik.dajBroj("Jusuf");
        assertEquals("033/333-444",broj);
    }

    @Test
    public void dajBrojNema() {
        String broj = imenik.dajBroj("Juuusuuuf");
        assertNull(broj);
    }

    @Test
    public void dodajFiksniException(){
        assertThrows(BrojException.class, () -> {new FiksniBroj(null,"123-123");});
    }


}