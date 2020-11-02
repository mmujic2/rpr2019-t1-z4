package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa nekaKorpa = new Korpa();
        assertTrue(nekaKorpa.dodajArtikl(new Artikl("pepsi", 2, "303")));

        for (int i = 0; i < 49; i++) {
            nekaKorpa.dodajArtikl(new Artikl("stolica" + i, 100, "40" + i));
        }
        assertFalse(nekaKorpa.dodajArtikl(new Artikl("sto", 200, "500")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa nekaKorpa = new Korpa();
        nekaKorpa.dodajArtikl(new Artikl("pepsi", 2, "303"));
        nekaKorpa.dodajArtikl(new Artikl("torba", 20, "302"));
        nekaKorpa.dodajArtikl(new Artikl("sto", 200, "301"));
        assertEquals("sto", nekaKorpa.izbaciArtiklSaKodom("301").getNaziv());
    }

    @Test
    void getArtikli() {
        Korpa nekaKorpa = new Korpa();
        assertEquals(50, nekaKorpa.getArtikli().length);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa nekaKorpa = new Korpa();
        nekaKorpa.dodajArtikl(new Artikl("pepsi", 2, "303"));
        nekaKorpa.dodajArtikl(new Artikl("torba", 20, "302"));
        nekaKorpa.dodajArtikl(new Artikl("sto", 200, "301"));
        assertEquals(222, nekaKorpa.dajUkupnuCijenuArtikala());
    }

    @AfterAll
    static void completeFeatureTest() {
        Korpa nekaKorpa = new Korpa();
        nekaKorpa.dodajArtikl(new Artikl("stolica", 350, "300"));
        nekaKorpa.dodajArtikl(new Artikl("kasika", 5, "301"));
        nekaKorpa.dodajArtikl(new Artikl("sveska", 10, "302"));
        nekaKorpa.dodajArtikl(new Artikl("cetka", 20, "303"));

        nekaKorpa.izbaciArtiklSaKodom("301");
        nekaKorpa.izbaciArtiklSaKodom("303");

        assertEquals(360, nekaKorpa.dajUkupnuCijenuArtikala());
    }
}