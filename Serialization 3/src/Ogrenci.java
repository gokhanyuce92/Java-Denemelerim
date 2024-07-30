
import java.io.Serializable;

public class Ogrenci implements Serializable {
    
    private transient int id;  //transient anahtar kelimesi kullanarak bu property i javaya serileştirmemesi gerektiğini söylemiş oluruz
    private String isim;
    private String bolum;
    
    private static int ogrenci_sayisi = 0; //static alanlar objeye değilde classa ait alanlar oldugu için java da default transient gibi davranır.
    
    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }

    public Ogrenci(int id, String isim, String bolum) {
        this.id = id;
        this.isim = isim;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Öğrenci id : " + id +
                "\nÖğrenci isim : " + isim +
                "\nBölüm : " + bolum;
    }
    
}
