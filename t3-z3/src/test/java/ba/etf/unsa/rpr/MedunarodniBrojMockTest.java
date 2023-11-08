package ba.etf.unsa.rpr;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedunarodniBrojMockTest {

    private static MedunarodniBroj br = new MedunarodniBroj("+44","1112223334");

    @Test
    public void testMockIspisi() {
        MedunarodniBroj broj= Mockito.mock(MedunarodniBroj.class);
        Mockito.when(broj.ispisi()).thenReturn("Mock");
        br=broj;

        String test = br.ispisi();
        assertEquals("Mock",test);
    }


}