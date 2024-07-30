public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int fizik, int kimya, int biyoloji) {
        super(turkce, matematik, fizik, kimya, biyoloji);
    }

    @Override
    double puan_hesapla() {
        return getTurkce() * 0.5 + getMatematik() * 0.4 + (getFizik() + getKimya() + getBiyoloji()) * 0.1;
    }
    
}
