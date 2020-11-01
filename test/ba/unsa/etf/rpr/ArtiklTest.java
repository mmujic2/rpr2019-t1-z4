package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        assertEquals("pepsi", new Artikl("pepsi", 2, "303").getNaziv());
    }

    @Test
    void getKod() {
        assertEquals(2, new Artikl("pepsi", 2, "303").getCijena());
    }

    @Test
    void getCijena() {
        assertEquals("303", new Artikl("pepsi", 2, "303").getKod());
    }
}