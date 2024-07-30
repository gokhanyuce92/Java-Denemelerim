package Concrete;

import Abstract.ISeyirci;

public class Seyirci implements  ISeyirci {
    private String isim;
    public static int seyirci_sayisi = 0;
    
    public Seyirci(String isim) {
        this.isim = isim;
        
        seyirci_sayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void seyret() {
        System.out.println(getIsim() + " isimli kullanıcı oyun seyrediyor...");
    }
    
}
