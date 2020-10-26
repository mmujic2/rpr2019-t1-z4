package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        for (int i = 0; i < 50; i++){
            if (artikli[i] == null) {
                artikli[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for (int i = 0; i < 50; i++){
            if (artikli[i] != null && artikli[i].getKod().equals(kod)){
                a = artikli[i];
                artikli[i] = null;
            }
        }
        return a;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < 50; i++){
            if (artikli[i] != null) suma = suma + artikli[i].getCijena();
        }
        return suma;
    }
}
