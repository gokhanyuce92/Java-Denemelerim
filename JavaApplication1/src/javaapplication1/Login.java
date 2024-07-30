package javaapplication1;

public class Login {
    private String kullaniciAdi;
    private String sifre;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    public Login(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }
    
    public boolean GirisYap() {
        return this.kullaniciAdi.equals("gokhan") && this.sifre.equals("1234");
    }
}
