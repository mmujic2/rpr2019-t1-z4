package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];

    public void dodajArtikl(Artikl a) {
        for (int i = 0; i < 1000; i++){
            if (this.artikli[i] == null) {
                artikli[i] = a;
                break;
            }
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for (int i = 0; i < 1000; i++){
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
}
