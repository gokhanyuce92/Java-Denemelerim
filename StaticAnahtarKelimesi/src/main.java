
import Abstract.ISeyirci;
import Concrete.Seyirci;


public class main {
    
    //Program başlatıldıgında class lar icindeki static alanlar bellek e yerleştirir. bellegin alanında ona yer tahsis edilir.(tek referans)
    //Daha sonra o referans üzerindeki değeri programın herhangi bir yerinde artırıp azaltılabilir.
    //static alanlara obje üzerinden veya direk ilgili class referans ı üzerinden erişilebilir. örnek Seyirci.seyirci_sayisi  veya seyirci1.seyirci_sayisi
    
    public static void main(String[] args) {
        
        ISeyirci seyirci1 = new Seyirci("Gökhan");
        ISeyirci seyirci2 = new Seyirci("Gökçe");
        
        seyirci1.seyret();
        seyirci2.seyret();
        
        System.out.println("Seyirci sayısı: " + Seyirci.seyirci_sayisi);
    }
}
