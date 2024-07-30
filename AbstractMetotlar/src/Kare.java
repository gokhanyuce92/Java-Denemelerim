public class Kare extends Sekil {
    private int kenar_uzunlugu;

    public Kare(String isim, int kenar_uzunlugu) {
        super(isim);
        this.kenar_uzunlugu = kenar_uzunlugu;
    }
    
    @Override
    double alan_hesapla() {
        return kenar_uzunlugu * kenar_uzunlugu;
    }
    
}
