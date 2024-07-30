package ınheritance;

public class Calisan {
    private String isim;
    private String adres;
    private double maas;

    public Calisan(String isim, String adres, double maas) {
        this.isim = isim;
        this.adres = adres;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    
    public void BilgileriGetir() {
        System.out.println("isim= " + isim);
        System.out.println("adres= " + adres);
        System.out.println("maaş= " + maas);
    }
}
