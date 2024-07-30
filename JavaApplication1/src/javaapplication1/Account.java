package javaapplication1;

public class Account {
    private double bakiye;
    private String isim;
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

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public String getIsim() {
        return isim;
    }
    
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public Account() {
        this(0, "", "", "");
    }
    public Account(double bakiye, String isim, String kullaniciAdi, String sifre) {
        Login login = new Login(kullaniciAdi, sifre);
        if (login.GirisYap()) {
            System.out.println("Giriş başarılı");
            BilgileriGetir();
        }
        else {
            System.out.println("Giriş başarısız");
        }
    }
    
   public void BilgileriGetir() {
       System.out.println("Bakiye = " + this.bakiye);
       System.out.println("İsim = " + this.isim);
       System.out.println("Kullanici Adi = " + this.kullaniciAdi);
       System.out.println("Şifre = " + this.sifre);
   }
}
