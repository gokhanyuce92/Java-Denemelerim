public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int fizik, int kimya, int biyoloji) {
        super(turkce, matematik, fizik, kimya, biyoloji);
    }

    @Override
    double puan_hesapla() {
        return getTurkce() * 0.1 + getMatematik() * 0.5 + (getFizik() + getKimya() + getBiyoloji()) * 0.4;
    }
    
}
