
import Abstract.IMuhendis;
import Concrete.BilgisayarMuhendisi;
import Concrete.MakineMuhendisi;

public class main {
    
    public static void main(String[] args) {
        IMuhendis muhendis1 = new BilgisayarMuhendisi();
        IMuhendis muhendis2 = new MakineMuhendisi();
        
        BilgileriGetir(muhendis1);
        System.out.println("--------------------------------");
        BilgileriGetir(muhendis2);
        ((MakineMuhendisi)muhendis2).Calis();
    } 
    
    public static void BilgileriGetir(IMuhendis muhendis) {
        System.out.println("Toplam İş Tecrübesi: " + muhendis.ToplamIsTecrubesi());
        System.out.println("Yetkinlikler: ");
        for (String str : muhendis.YetkinlikleriGetir()) {
            System.out.println(str);
        }
        System.out.println("Ehliyet Sorgula: " + muhendis.EhliyetDurumSorgula());
        System.out.println("Adli Sicil Kaydı: " + muhendis.AdliSicilSorgula());
    }
}
