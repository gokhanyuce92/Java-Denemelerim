public class Abone1 {
    
    private String isim;
    private double bakiye = 120;
    private String sehir;
    
    public Abone1(String isim, double bakiye, String sehir) {
        this.isim = isim;
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye -= bakiye;
        }
        this.sehir = sehir;
    }
    
    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }
    public void kullan(double miktar) {
        if (bakiye - miktar < 0) {
            System.out.println("Yetersiz limit. Lütfen bakiye yükleyiniz");
        }
        else {
            if (bakiye - miktar == 0) {
                System.out.println("Bakiyeniz bitmiştir. Abone merkezine giderek bakiye yüklemesi yapınız");
            }
            else {
                bakiye -= miktar;
                System.out.println("Kalan bakiye = " + bakiye);
            }
        }
    }
    
}
