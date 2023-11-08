package ba.etf.unsa.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

class ImenikMockTest {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Jusuf", new FiksniBroj(Grad.SARAJEVO, "333-444"));
        imenik.dodaj("Ramo", new FiksniBroj(Grad.ZENICA, "555-444"));
        imenik.dodaj("Denis", new MobilniBroj(61, "666-444"));
        imenik.dodaj("Oliver", new MedunarodniBroj("+44", "1234566666"));
    }

    @Test
    public void testMockExternal() {
        Imenik i = Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Jusuf")).thenReturn("Mock");

        String test = i.dajBroj("Jusuf");
        assertEquals("Mock",test);
    }

    @Test
    public void  testMockInternal() {
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class);
        Mockito.when(mapa.get("Jusuf")).thenReturn(new FiksniBroj(Grad.BANJA_LUKA,"111-222"));
        imenik.setBrojevi(mapa);

        String br= imenik.dajBroj("Jusuf");
        assertNotEquals("033/333-444",br);
        assertEquals("051/111-222",br);
    }



}