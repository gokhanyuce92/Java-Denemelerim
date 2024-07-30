public class Abone {
    
    public String isim;
    public double bakiye;
    public  String sehir;
    
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
