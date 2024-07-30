public class Daire extends Sekil {
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    double alan_hesapla() {
        return Math.PI * yaricap * yaricap;
    }
    
}
