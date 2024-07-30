package ınheritance;

public class Yonetici extends Calisan {

    public Yonetici(String isim, String adres, double maas) {
        super(isim, adres, maas);
    }
    
    public void ZamYap(double zamMiktari) {
        double _maas = getMaas();
        _maas += zamMiktari;
        setMaas(_maas);
        System.out.println("Maaşa " + zamMiktari + " kadar zam yapıldı. Yeni maaş = " + getMaas());
    }

}
