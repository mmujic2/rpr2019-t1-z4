package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket nekiSupermarket = new Supermarket();
        Artikl nekiArtikl = new Artikl("pepsi", 2, "302");
        nekiSupermarket.dodajArtikl(nekiArtikl);
        assertEquals("pepsi", nekiSupermarket.getArtikli()[0].getNaziv());
        assertEquals(2, nekiSupermarket.getArtikli()[0].getCijena());
        assertEquals("302", nekiSupermarket.getArtikli()[0].getKod());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket nekiSupermarket = new Supermarket();
        nekiSupermarket.dodajArtikl(new Artikl("pepsi", 2, "302"));
        nekiSupermarket.dodajArtikl(new Artikl("kamen", 0, "300"));
        nekiSupermarket.dodajArtikl(new Artikl("CD", 10, "301"));
        nekiSupermarket.izbaciArtiklSaKodom("300");
        assertNull(nekiSupermarket.getArtikli()[1]);
    }

    @Test
    void getArtikli() {
        Supermarket nekiSupermarket = new Supermarket();
        assertEquals(1000, nekiSupermarket.getArtikli().length);
    }
}