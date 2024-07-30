public abstract class Aday {
    private int turkce;
    private int matematik;
    private int fizik;
    private int kimya;
    private int biyoloji;

    public Aday(int turkce, int matematik, int fizik, int kimya, int biyoloji) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.biyoloji = biyoloji;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getKimya() {
        return kimya;
    }

    public void setKimya(int kimya) {
        this.kimya = kimya;
    }

    public int getBiyoloji() {
        return biyoloji;
    }

    public void setBiyoloji(int biyoloji) {
        this.biyoloji = biyoloji;
    }
    
    abstract double puan_hesapla();
}
